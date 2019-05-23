/* Shopping Cart Application Template
 * Complete the missing code in the program
 */

import java.util.*;

public class Lab13ShoppingApp {
   
   public static void main(String[] args) {
      //create cart object 
      ShoppingCart cart = new ShoppingCart();
      
      boolean exit = false;
      
      while(!exit)
      {
         char op = menu();
         
         switch (op) {
            case 'A': 
               
               //Method call for adding a new order **use readOrderFromKeyboard()as argument
               cart.addOrder(readOrderFromKeyboard());
               continue;
               
            case 'B': 
               
               //Method call for listing orders in the cart
               cart.listOrders();
               continue;
         
               
            case 'C': 
               
               //Method call for listing orders in the cart
               //Method call for billing orders in the cart
               String choice;
               Scanner keyboard = new Scanner(System.in);
               cart.listOrders();
               System.out.println("Total: $" + cart.getBill());
               
               //Asks if user is paying bill
               System.out.println("You are paying the bill");
               System.out.print("Are you sure? (Yes/No) ");
               choice = keyboard.next();
               
               //If user opts to pay, cart is cleared; if not, cart remains
               if (choice.equalsIgnoreCase("yes")){
                  System.out.println("Done");
                  cart = new ShoppingCart();
        
               }
               else {
                  System.out.println("You Bastard!");
               }
                  continue;
               
            case 'X': 
               //Code for exit
               System.out.println("Thank you for shopping with us!");
               return;
               
            default: System.out.println("Wrong Option");
            break; 
         }
      }
   }
   
   public static char menu() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\t===============================");
      System.out.println("\tCSE174 ShoppingCart Application"); 
      System.out.println("\tDeveloped by: Max Zaremba "); 
      System.out.println("\tDate: 5-3-2019");
      System.out.println("\tSchool Market");
      System.out.println("\t===============================");
      System.out.println("\tA. Add an item to the Shopping Cart");
      System.out.println("\tB. List items in the Shopping Cart");
      System.out.println("\tC. Pay the bill");
      System.out.println("\tX. Exit");
      System.out.println();
      System.out.print("Option:"); 
      
      return keyboard.nextLine().toUpperCase().charAt(0);
      
   }
   
   
   public static Order readOrderFromKeyboard(){
      Scanner keyboard = new Scanner(System.in);
      int barCode = 0, units = 0;
      double price = 0;
      String name;
      
      //Displays imput prompts for bar code, item name, units purchased and price.
      System.out.println("***Enter the Details");
      System.out.print("Bar Code: ");
      barCode = keyboard.nextInt();
      System.out.print("Name: ");
      name = keyboard.next();
      System.out.print("Units: ");
      units = keyboard.nextInt();
      System.out.print("Unit Price: ");
      price = keyboard.nextDouble();
      System.out.println("Order is placed in the cart");
      keyboard.close();
      
      //Creates new order object from user imputs
      return new Order(barCode, name, units, price);
   
      
      //return Order object;    
   }
}
