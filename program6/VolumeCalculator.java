/* Max Zaremba
 * 3/6/2019
 * File Name: VolumeCalculator
 * Description: Calculates the volume of a sphere, cylinder or cube.
 */

import java.util.Scanner;

public class VolumeCalculator{
   
   //Declares all variables. 
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      String letter;
      Double volume, radius, height, side;
      
      //Prints the menu screen and prompts user for input
      System.out.println("-- Menu --");
      System.out.println("a) Volume of a sphere");
      System.out.println("b) Volume of a cylinder");
      System.out.println("c) Volume of a cube");
      System.out.print("Enter your choice: ");
      letter = keyboardReader.next();
      
      //if statement for option "a"
      if (letter.equals("a")){
         System.out.print("Enter the radius: ");
         radius = keyboardReader.nextDouble();
         volume = sphere(radius);
         
      }
      
      //if statement for option "b"
      else if (letter.equals("b")){
         System.out.print("Enter the radius: ");
         radius = keyboardReader.nextDouble();
         System.out.print("Enter the height: ");
         height = keyboardReader.nextDouble();
         volume = cylinder(radius, height);
      }
      
      //if statement for option "c"
      else if (letter.equals("c")){
         System.out.print("Enter the side length: ");
         side = keyboardReader.nextDouble();
         volume = cube(side);
      }
      //else statement for invalid input
      else {
         System.out.println("The selection is not correct.");
      }
      
      keyboardReader.close();
   }
   
   //Method used to calculate the volume of a sphere
   public static double sphere(double radius){
      double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
      System.out.printf("The sphere volume is %.3f.\n", volume);
      return volume;  
   }
   
   //Method used to calculate the volume of a cylinder
   public static double cylinder(double radius, double height){
      double volume = Math.PI * Math.pow(radius, 2) * height;
      System.out.printf("The cylinder volume is %.3f.\n", volume);
      return volume;
      
   }
   
   //Method used to calculate the volume of a cube
   public static double cube(double side){
      double volume = side * side * side;
      System.out.printf("The cube volume is %.3f.\n", volume);
      return volume;
   }
}

