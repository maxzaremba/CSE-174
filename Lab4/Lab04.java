/* Max Zaremba
 * 2/22/2019
 * File Name: Lab4
 * Description: Prints total music store price depending on if
 * the customer is a teacher.
 */

import java.util.Scanner;

public class Lab04{
   
   //Declares all variables
   public static void main(String[] args){
      char teacher;
      double total1, total2, disc, discT, tax;
      Scanner keyboardReader = new Scanner(System.in);
      
      //Asks user if they are a teacher, asks for total, and calcuatrs discount
      System.out.print("Is customer a teacher (Y/N) ?");
      teacher = keyboardReader.next().charAt(0);
      
      if (teacher == 'Y'){
         System.out.println("Enter total purchases:");
         total1 = keyboardReader.nextDouble();
         
         if (total1 > 100) {   
            disc = total1*(0.12);
         }   
         else { 
            disc = total1*(0.10);
         }   
         
         System.out.printf("total purchases = %.2f\n", total1);
         System.out.printf("Teacher's discount (0.12) = %.3f\n", disc);
         
         //Calculates and prints the new total including the discount and sales tax
         discT = total1 - disc;
         System.out.printf("Discounted total = %.3f\n", discT);
         tax = discT*(0.05);
         System.out.printf("Sales tax (0.05) = %.3f\n", tax);
         total2 = discT + tax;
         System.out.printf("Total = %.3f\n", total2);
      }
      
      else {
         //Calculates all values minus the discount if the user inputs "N"
         System.out.println("Enter total purchases:");
         total1 = keyboardReader.nextDouble();
         System.out.printf("total purchases = %.2f\n", total1);
         tax = total1*(0.05);
         System.out.printf("Sales tax (0.05) = %.3f\n", tax);
         total2 = total1 + tax;
         System.out.printf("Total = %.3f\n", total2);
         keyboardReader.close(); 
         
      }
   }
}