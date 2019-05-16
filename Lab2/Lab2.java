/* Max Zaremba
 * 2/7/2019
 * File Name: Lab2
 * Description: Prints the measurements of a box
 * when a side length is entered.
 */

import java.util.Scanner;

public class Lab2{
   
   //Declares Variables
   public static void main(String[] args){
      double leng, wide, heig;
      double volu, sarea;
      Scanner scan = new Scanner(System.in);
      
      //Prints the instructions
      System.out.print("Enter the length");
      leng = scan.nextDouble();
      System.out.print("Enter the width");
      wide = scan.nextDouble();
      System.out.print("Enter the height");
      heig = scan.nextDouble();
      
      //Sets variable values
      volu = leng*wide*heig;
      sarea = 2*(heig*wide)+2*(heig*leng)*2+(wide*leng);
      
      //Prints the calculated values
      System.out.println("Surface Area = " +sarea);
      System.out.println("Volume = " +volu);
      
      //Asks user for a new height
      System.out.println("*** Enter the NEW height:");
      heig = scan.nextDouble();
      
      //Resets variable values
      volu = leng*wide*heig;
      sarea = 2*(heig*wide)+2*(heig*leng)*2+(wide*leng);
      
      //Prints out new calculated values
      System.out.println("Surface Area = " +sarea);
      System.out.println("Volume = " +volu);
      scan.close();
   }
   
}