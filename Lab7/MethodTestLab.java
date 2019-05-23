/* Max Zaremba
 * 3/8/2019
 * Lab 6
 * Description: Completes all cases.
 */

import java.util.Scanner;
public class MethodTestLab {
   public static void main(String[] args) {
      
      int userChoice;
      String str;
      Scanner input = new Scanner(System.in);
      
      //Display menu
      System.out.println("Menu\n 1.sameFirstLast\n 2.allTheSame\n 3.big2Digits\n 4.reverseString\n 5.sorted\n");
      
      //Read user's choice
      System.out.print("Enter your choice");
      userChoice = input.nextInt();
      
      //Invoke methods
      switch(userChoice) { 
         case 1:
            //This is written for you as an example
            System.out.println("\n\"Displays true if the first and last characters in a string are same else false\"\n");
            System.out.print("Enter a String: ");
            str = input.next();
            String firstLast;
            
            //sameFirstLast method is invoked. 
            System.out.println(sameFirstLast(str));
            
            break;
            
         case 2:
            System.out.println("\n Enter 3 numbers. \n");
            int num1, num2, num3;
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
            System.out.println(allTheSame(num1, num2, num3));
            break;
            
         case 3:
            System.out.println("\n Enter a single 3 digit number \n");
            int num;
            num = input.nextInt();
            System.out.println(big2Digits(num));
            break;
            
         case 4:
         System.out.println("\n Enter a 3 letter string. \n");
         String stri;
         stri = input.next();
         System.out.println(reverseString(stri));
         break;
            
         case 5: 
            System.out.println("\n Enter 3 digits, pressing \"enter\" after each one. \n");
            int num11, num12, num13;
            num11 = input.nextInt();
            num12 = input.nextInt();
            num13 = input.nextInt();
            System.out.println(sorted(num11, num12, num13));
            break;
            
         default: 
            System.out.println("Invalid Choice");
      }   
      System.out.println("End");
      
   }//end of main()
   
   //----- Complete the method stubs here....
   
   /**
    This method takes a string as argument and returns true if the first and the last characters are same else false
    @param s The string to be tested
    @return The boolean result
    */
   public static boolean sameFirstLast(String s) {
      int stringLength = s.length();
      String letter1 = (s.substring(0,1)); 
      String finalLetter = (s.substring((stringLength-1), (stringLength)));
      
      if (letter1.equals(finalLetter)){
         return true;
      }
      else
         return false;
   }
   
   
   
   /**
    This method accepts three integer numbers passed in as arguments and returns true if the three numbers are the same otherwise, false. 
    @param num1 first integer number 
    @param num2 second integer number
    @param num3 third integer number
    @return ture if num1, num2 and num2 are same, false otherwise
    */
   public static boolean allTheSame(int num1, int num2, int num3) {
      if ((num1 == num2) & (num1 == num3)){
         return true;
      }
      else
         return false;
   }
   
   /**
    This method accepts a three-digit integer passed in as argument and returns true if the first digit is greater
    than the last digit otherwise false 
    @param num Three-digit positive integer 
    @return The boolean answer
    */
   public static boolean big2Digits(int num) {
      int num5 = num / 100;
      int num6 = num % 10;
      
      if (num5 > num6){
         return true;
      }
      else
         return false;
      
   }
   
   /**
    This method accepts a three-lettered string as argument and returns the reversed one
    @param str Three-lettered string 
    @return The reversed string
    */
   public static String reverseString(String stri) {
      String word1 = stri.substring(0, 1);
      String word2 = stri.substring(1, 2);
      String word3 = stri.substring(2, 3);
      
      String wordFinal = word3 + word2 + word1;
      return wordFinal;
   }
   
   /**
    This method accepts three integer numbers passed in as arguments and returns true if they are sorted otherwise, false
    @param num1 The integer number
    @param num2 The integer number
    @param num3 The integer number
    @return true if num1 <= num2 <= num3, false otherwise
    */
   public static boolean sorted(int num1, int num2, int num3) {
      if ((num1 <= num2) && (num2 <= num3)){
         return true;
      }
      else {
         return false;
      }
   }
}
