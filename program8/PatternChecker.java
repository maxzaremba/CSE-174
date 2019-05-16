/* Max Zaremba
 * 3/18/2019
 * File Name: PatternChecker
 * Description: Program calculates largest and smallest pairs, the approximation of Pi or the
 * greatest common divisor based upon user input.
 */

import java.util.Scanner;

public class PatternChecker{
   
   static Scanner keyboardReader = new Scanner(System.in);
   
   //Declares all variables.
   public static void main(String[] args){
      int choice = 0;
      int n = 0, x = 1, y = 1;
      double i = 0;
      
      do {
         System.out.println("\nList of Pattern Checker Problems:");
         System.out.println("1) Largest and Smallest Pairs");
         System.out.println("2) PI approximation");
         System.out.println("3) Greatest common divisor");
         System.out.println("4) Quit");
         System.out.print("Choice:");
         choice = keyboardReader.nextInt();
         
         if (choice == 1){
            //return Largest and Smallest pairs method
            largeAndSmall(n);
         }
         else if (choice == 2){
            //return PI approximation method
            PIapprox(i);
         }
         else if (choice == 3){
            //return Greatest Common Divisor method
            GCD(x, y);
         }
         else if (choice == 4){
            //ends menu loop if chosen
            System.out.println("*** End");
            break;
         }
         else {
            //displayed if user enters a number other than 1 - 4
            System.out.println("Invalid input.");
         }
      } while (choice >= 1 || choice <= 4);
   }
   
   //largest and smallest method
   public static int largeAndSmall(int n){
      
      System.out.print("Enter the limit: "); 
      
      n = keyboardReader.nextInt();
      int largest = 0;
      int largest2 = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;
      int smallest2 = Integer.MAX_VALUE;
      
      //loop in case of invalid input
      while (n <= 0){
         System.out.println("Invalid Input. The limit should be at least 2.");
         System.out.print("Enter the limit: "); 
         n = keyboardReader.nextInt();
      }
      System.out.printf("Enter %d numbers: %n", n); 
      
      //loop that calculates largest and smallest pairs
      for (int i = 0; i < n; i++) { 
         int current = keyboardReader.nextInt(); 
         if (current > largest) { 
            largest2 = largest;
            largest = current; 
         }  
         else if (current > largest2 && current < largest){
            largest2 = current;
         }
         if (current < smallest) { 
            smallest2 = smallest;
            smallest = current; 
         } 
         else if (current < smallest2 && current > smallest ){
            smallest2 = current;
         }
      } 
      
      System.out.println("Largest and smallest pairs: (" + largest + ", " + largest2 + "), (" + smallest + ", " + smallest2 + ")"); 
      return n;
   } 
   
   //PI approximation method
   public static double PIapprox(double i){
      System.out.print("Enter the number of terms you want to use for approximating the PI value: ");
      
      int j = keyboardReader.nextInt();
      double sum = 0;
      
      //loop that calculates the PI approximation
      for (i = j; i > 0; i--) {
         sum += Math.pow(-1, i + 1) / (2 * i - 1);
         if (i == 1) {
            sum *= 4;    
            System.out.printf("*** PI is approximately %.2f\n", sum);
         }
      }
      return sum;
   }
   
   //greatest common divisor method
   public static int GCD(int x, int y){
      System.out.print("Enter two numbers:");
      x = keyboardReader.nextInt();
      y = keyboardReader.nextInt();
      
      //loop that calculates the GCD
      while (x < 1 || y < 1) {
         System.out.println("Invalid input. Enter two positive numbers:");
         x = keyboardReader.nextInt();
         y = keyboardReader.nextInt();
      }
      int z = 0;
      int temp = 0;
      
      if(x < y) {
         temp = x;
         x = y;
         y = temp;
      }
      for(z = x;(x % z !=0 || y % z != 0);z--)  {  
      }
      System.out.println("*** The greatest common divisor of " + x + " and " + y + " is " + z +".\n");
      return z;
   }
}