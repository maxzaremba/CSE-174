/* Max Zaremba
 * 3/22/2019
 * File Name: Lab 6
 * Description: User selects a menu option and then the program computes the values the user inputs.
 */

import java.util.Scanner;

public class Lab6{
   
   static Scanner keyboardReader = new Scanner(System.in);
   
   //Declares all variables.
   public static void main(String[] args){
      String pickChoice;
      int choice;
      
      //Do while loop for menu switch statement
      do {
         System.out.println("\nMenu");
         System.out.println("1. displayEven");
         System.out.println("2. findMax");
         System.out.println("3. Exit");
         
         choice = keyboardReader.nextInt();
         
         
         switch (choice) {
            case 1:
               pickChoice = "1";
               displayEven();
               break;
               
            case 2:
               pickChoice = "2";
               int max = findMax();
               System.out.println("The max = " + max);
               break;
               
            case 3:
               pickChoice = "3";
               System.out.println("*** End");
               return;
               
            default:
               System.out.println("Invalid Input!");
         }
      }
      while(true);
   }
   // Method for displaying the even loop
   public static int displayEven(){
      System.out.println("Enter the limit");
      int n = keyboardReader.nextInt();
      int i = -2;
      
      while ( i < n){
         i = i + 2;
         System.out.print(i + " ");
      }
      return i;
   }
   //Method for finding the max value out of user inputs
   //A negative number stops the loop
   public static int findMax(){
      int max = Integer.MIN_VALUE;
      int num = 1;
      
      System.out.println("Enter the numbers");
      
      while (num >= 0){
         num = keyboardReader.nextInt();
         
         if (num > max){
            
            max = num;
         } 
      }
      return max;
   }  
}