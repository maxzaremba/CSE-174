/* Max Zaremba
 * 4/5/2019
 * File Name: Lab 9
 * Description:
 */

import java.util.Scanner;

public class Lab9{
   
   static Scanner kB = new Scanner(System.in);
   
   //Declares all variables.
   public static void main(String[] args){
      int test = 0;
      int endTest = 0;
      int count = 0;
      int ftest = 0;
      int max = 0;
      
      System.out.print("Starting Number to test?\n");
      test = kB.nextInt();
      ftest = test;
      int minMax = Integer.MIN_VALUE;
      
      System.out.print("Ending number to test?");
      endTest = kB.nextInt();      
      for (int i = test; i < endTest + 1; i++){
         
         while (test > 1){
            
            if (test % 2 == 0){
               test = test / 2;
            }
            else {
               test = (test * 3) + 1;
            }
            count++;
            
            if (test > minMax){
               minMax = test;
            }
         }
         System.out.printf("\n%d: %d steps, max was %d", i, count, minMax);
         test = i + 1;
         count = 0;
         minMax = 0;
      }
   }
}