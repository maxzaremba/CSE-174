/* Max Zaremba
 * 2/22/2019
 * File Name: BookstoreOrder
 * Description: Prints the total bookstore price.
 */

import java.util.Scanner;

public class BookstoreOrder{
   
   //Declares all variables
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      double booknum, bprice, tprice, tax, shipping;
      
      //Asks user for number of books purchased and total cost of books
      System.out.print("Number of books purchased : \n");
      booknum = keyboardReader.nextDouble();
      System.out.print("Cost of books : \n");
      bprice = keyboardReader.nextDouble(); 
      
      //Calculates tax, shipping and final price
      tax = bprice*(0.075);
      
      System.out.printf("Tax : $%.2f\n", tax);
      
      shipping = booknum*2;
      
      System.out.printf("Shipping charge : $%.2f\n", shipping);
      
      tprice = bprice + tax + shipping;
      
      //Prints final total
      System.out.printf("Total : $%.2f\n", tprice);
      
      keyboardReader.close(); 
    
   }  
}