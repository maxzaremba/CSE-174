/* Max Zaremba
 * 2/22/2019
 * File Name: ExtactDollarsAndCents
 * Description: Directs a cashier how to give change.
 */

import java.util.Scanner;

public class ExtractDollarsAndCents{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      int amountD, amountR, change;
      int dollars, quarters, nickels, dimes, pennies;
      
      //Takes user input for ammount due and recieved
      System.out.print("Amount Due : ");
      amountD = (int) Math.round(keyboardReader.nextDouble() * 100);
      
      System.out.print("Amount Recieved : ");
      amountR = (int) Math.round(keyboardReader.nextDouble() * 100);
      
      //Prints total change needed
      if (amountR > amountD) {
         System.out.printf("Total Change Needed : $%.2f\n", ((amountR - amountD)/100.00));
         System.out.println("Return : ");
         
         change = amountR - amountD;
         
         //Calculates how many dollars and coins are needed
         dollars = change / 100;
         if (dollars > 0) {
            change = change % 100;
            System.out.println(dollars + " Dollar(s)");
         }
         
         quarters = change / 25;
         if (quarters > 0) {
            change = change % 25;
            System.out.println(quarters + " Quarter(s)");
         }
         
         dimes = change / 10;
         if (dimes > 0) {
            change = change % 10;
            System.out.println(dimes + " Dime(s)");
         }
         
         nickels = change / 5;
         if (nickels > 0) {
            change = change % 5;
            System.out.println(nickels + " Nickel(s)");
         }
         pennies = change;
         System.out.println(pennies + " Penny(s)");
      }
      
      //Statements that print if exact change or not enough change is given
      if (amountR < amountD) { 
         System.out.print("Undercharged!");
      } else if (amountR == amountD) { 
         System.out.print("No change needed!");
         
         keyboardReader.close();         
      }
   }
}