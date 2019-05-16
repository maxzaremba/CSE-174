/* Max Zaremba
 * 2/25/2019
 * File Name: LineForm
 * Description: Calculates slope-intercept form from either two points or a point and a slope.
 *
 * Test Cases for two-point
 * 1.) Input: (3, 2), (7, -4)
 *     Output: y = -1.50x - 6.50
 * 2.)Input: (5, 8), (7, 4)
 *    Output: y = -2.00x + 18.00
 * 
 * Test Cases for Point-slope
 * 1.) Input: 4, (4, 7)
 *     Output: y = 4.00x + -9.00
 * 2.) Input: 10 (30, 80)
 *     Output: y = 10.00x + -220.00
 */ 

import java.util.Scanner;

public class LineForm{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      String input;
      Double x1, x2, y1, y2, slope, intercept;
      
      //Prints Greeting and prompts for input
      System.out.println("Welcome to LineForm! Select the from that you would like to convert into slope-intercept form:");
      System.out.println("1 = Two-point form (You know two points on the line)");
      System.out.println("2 = Point-slope form (You know the line's slope and one point)");
      input = keyboardReader.next();
      
      //if statement for two-point input
      if (input.equals("1")) {
         System.out.print("Enter the x-y coordinates of the first point separated by a space : ");
         x1 = keyboardReader.nextDouble();
         y1 = keyboardReader.nextDouble();
         
         System.out.print("Enter the x-y coordinates of the second point separated by a space : ");
         x2 = keyboardReader.nextDouble();
         y2 = keyboardReader.nextDouble();
         
         //Slope and intercept are calculated
         slope = (y2 - y1)/(x2 - x1);;
         intercept = (y1 - slope*(x1));
         
         //Prints output
         System.out.println("\nTwo-point form");
         System.out.printf("  ( %.2f - %.2f )\n", y2, y1);
         System.out.println("m=---------------");
         System.out.printf("  ( %.2f - %.2f )\n", x2, x1);
         
         System.out.println("\nSlope-intercept form");
         System.out.printf("y = %.2fx + %.2f", slope, intercept);
         
         keyboardReader.close();
         return;
      } 
      
      //if statement for slope-intercept
      if (input.equals("2")) {
         System.out.print("Enter the Slope : ");
         slope = keyboardReader.nextDouble();
         
         System.out.print("Enter the x-y coordinates of the point separated by a space : ");
         x1 = keyboardReader.nextDouble();
         y1 = keyboardReader.nextDouble();
      
      //Prints point-slope form
         System.out.println("\nPoint-slope form:");
         System.out.printf("(y - %.2f) = %.2f(x - %.2f)\n", y1, slope, x1);
     
      //Calculates intercpet
         intercept = (y1 - slope*(x1));
    
      //Prints output   
         System.out.println("\nSlope-intercept form:");
         System.out.printf("y = %.2fx + %.2f", slope, intercept);
         
         keyboardReader.close();
      }
      
      //else statement for invalid input
      else {
         System.out.println("Invalid input!");
      
      }
   }
}

