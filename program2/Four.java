/* Max Zaremba
 * Dr. Manar Mohammad
 * CSE 174 , Section C
 * 2/6/2019
 * Filename: Four
 * Description: Calculates the Area, Perimeter, Surface Area and Volume of a square.
 */

import java.util.Scanner;

public class Four{
   //Declares variables
   public static void main(String args[]){
      double side, peri, area;
      double volu, sArea;
      Scanner scan = new Scanner(System.in);
      
      //Prints instructions
      System.out.print("Enter Side Length of Square: ");
      side = scan.nextDouble();
      
      //Sets variable values
      area = side*side;
      peri = 4*side;
      volu = side*side*side;
      sArea= 6*area;
      
      //Prints variables
      System.out.print("Area = " +area);
      System.out.print("\nPerimeter = " +peri);
      System.out.println("\nVolume = " +volu);
      System.out.println("Surface Area = " +sArea);
      scan.close();
   }
}