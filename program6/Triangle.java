/* Max Zaremba
 * 3/4/2019
 * File Name: Triangle
 * Description: Prints 3 triangles based upon user input characters.
 */

import java.util.Scanner;

public class Triangle{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      String input;
      
      //Prints input instructions
      System.out.print("Enter the three characters to be displayed in the triangles: ");
      input = keyboardReader.next();
      
      //Calls triangle method for each character that the user inputs
      triangle(input.charAt(0));
      triangle(input.charAt(1));
      triangle(input.charAt(2));
      
      keyboardReader.close();
      }
   
   //Method used to create the triangle shape
   public static void triangle(char input){
      System.out.println("   " + input + "   ");
      System.out.println("  " + input + input + input + "  ");
      System.out.println(" " + input + input + input + input + input + " \n");
      return;     
   }
}

