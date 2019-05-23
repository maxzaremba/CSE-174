/* Max Zaremba
 * 4/12/2019
 * File Name: Lab 10
 * Description: Prints randomly generated numbers from an array that add up to
 * the array size and prints the max difference.
 */

import java.util.*;

public class lab10{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner kB = new Scanner(System.in);
      int num = 0;
      int values = 0;
      
      System.out.print("How many numbers do you want to generate?");
      num = kB.nextInt();
      System.out.print("What is the number of values for each random draw?");
      values = kB.nextInt();
      
      int[] numArray = new int[values];
      
      //generates random numbers within the user specified range and stores and increments them with the array.
      for (int i = 0; i < num; i++){
         int random = (int)(Math.random()* values);
         numArray[random]++;    
      }
      
      //prints numbers
      for (int i = 0; i < values; i++){
         System.out.print(i + " ");
         System.out.print(numArray[i] + "\n");
      }
      
      //finds the max and min values within the array and returns their difference
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for(int largest: numArray){
         if (max < largest){
            max = largest;
         }
         if (min > largest){
            min = largest;
         }
      }
      int difference = max - min;
      System.out.println("The max difference is = " + difference);
      kB.close();
   }
}