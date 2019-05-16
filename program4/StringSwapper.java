/* Max Zaremba
 * 2/23/2019
 * File Name: StringSwapper
 * Description: Swaps two characters in a string.
 *
 * Successful Test Cases
 * Imput          Output
 * *****          ******
 * Cat            Cta
 * Hello          Hlelo
 * Cauliflower    Cualiflower
 * Hawaii         Hwaaii
 * UwU            UUw
 * 
 * Failed Test Cases
 * Imput          Output
 * *****          ******
 * A              String too Short!
 * I              String too Short!
 * At             String too Short!
 * No             String too Short!
 */


import java.util.Scanner;

public class StringSwapper{
   
   //Declares all variables
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      String first, middle, last, i, j, str, newString;
      
      //Asks user to input the string
      System.out.println("Welcome to StringSwapper!");
      System.out.print("Enter an imput string : ");
      str = keyboardReader.next();
      
      //if statement in case the string is too short.
      if (str.length() < 3) {
         System.out.println("String is too short!");
         keyboardReader.close();
         return;
      }
      
      //Assigns values to string variables
      first = str.substring(0, 1);
      i = str.substring(1, 1 + 1);
      middle = str.substring(1 + 1, 2);
      j = str.substring(2, 2 + 1);
      last = str.substring(2 + 1);
      
      //Rearranges and prints the swapped string
      newString = first + j + middle + i + last;
         
         System.out.println("Swapped String : " + newString);
         
         keyboardReader.close();     
         
   } 
}