/* Program 13 
 * CSE 174 Spring 2019 
 */

import java.util.ArrayList; // Needed for ArrayList class
import java.util.Scanner;

/**          
 This program demonstrates how to store BankAccount
 objects in an ArrayList and manage banking transactions.
 */

public class Program13 {
   static    Scanner in = new Scanner(System.in);    
   public static void main(String[] args) {
      int choice;
      
      // Create an ArrayList to hold BankAccount objects.
      ArrayList<BankAccount> list = new ArrayList<BankAccount>();    
      boolean option = true;
      do {   
         System.out.println("***  Menu  ***\n1. Create Account \n2. Display \n3. Display All\n4. Deposit \n5. Withdraw \n6. Remove Account \n7. Exit");
         System.out.print("Enter your choice: ");
         choice = in.nextInt();
         switch(choice) {
            
            case 1: 
               System.out.println("**Create New Account**");
               createAccount(list);
               break;
            case 2: 
               display(list);  
               break;
            case 3:
               displayAll(list);
               break;
            case 4:
               deposit(list);
               break;
            case 5:
               withdraw(list);
               break;
            case 6:
               removeAccount(list);
               break;
            case 7:
               System.out.println("Thank you for banking with us!!");
               option = false;
               break;
               
            default:
               System.out.println("Please enter a number between 1 and 7.");
               break;
      
         }
      } while (option);
   }
   
   /**
    The createAccount method creates
    a new BankAccount object given a name and initial balance
    specified by the user, then appends to the ArrayList list.
    @param list The list of bank accounts
    */
   
   public static void createAccount(ArrayList<BankAccount> list) {
      
      String user;
      int balance = 0;
      
      System.out.print("Enter name: ");
      user = in.next();
      System.out.print("Starting balance: ");
      balance = in.nextInt();
      
      BankAccount customer = new BankAccount(user, balance);
      list.add(customer);
      
      System.out.println("Account created!");
   }
   
   /**
    The display method displays
    the specified BankAccount object in the ArrayList list
    given the name of the account specified by the user
    @param list The list of bank accounts
    */
   
   public static void display(ArrayList<BankAccount> list) {
      
      //displays the specific account details
      String user;
      if (list.isEmpty()){
            System.out.println("No accounts created yet!!");
            return;
         }
      System.out.println("Enter your name: ");
      user = in.next();
      System.out.println("**Account Details**");
      for (BankAccount ele: list){
         if (ele.getName().equalsIgnoreCase(user)){
            System.out.println("Name: " + user + "   Balance: " + ele.getBalance());
            return;
         }
      } 
      System.out.println(user + " does not exist");
   }
   
   /**
    The displayAll method displays 
    all the BankAccount objects in the ArrayList list.
    @param list The list of bank accounts
    */
   public static void displayAll(ArrayList<BankAccount> list){
      
      // display all the account details
      System.out.println("Bank Account Details");
      for (BankAccount ele: list){
         System.out.println("Name : " + ele.getName() + "   Balance: " + ele.getBalance());
      }
      if (list.isEmpty()){
            System.out.println("No accounts created yet!!");
         }
   }
   
   /**
    The withdraw method updates 
    the balance of specified BankAccount object in the ArrayList list
    using the amount specified by the user.
    @param list The list of bank accounts
    */
   public static void withdraw(ArrayList<BankAccount> list) {
      
      // withdraw amount from the specific object
      String user;
      double money = 0;
      if (list.isEmpty()){
            System.out.println("No accounts created yet!!");
            return;
         }
      System.out.println("**Transaction - Withdraw**");
      System.out.println("Enter your name: ");
      user = in.next();
      for (BankAccount ele: list){
         if (ele.getName().equalsIgnoreCase(user)){
            System.out.println("Enter amount to withdraw: ");
            money = in.nextDouble();
            ele.withdraw(money);
            System.out.println("Name: " + user + "   Balance: " + ele.getBalance());
            return;
         }
      }
      System.out.println(user + " does not exist");
   }
   
   /**
    The deposit method updates 
    the balance of specified BankAccount object in the ArrayList list
    using the amount specified by the user.      
    @param list The list of bank accounts
    */
   public static void deposit(ArrayList<BankAccount> list) {
      
      // deposit amount into the specific object
      String user;
      double money = 0;
      if (list.isEmpty()){
            System.out.println("No accounts created yet!!");
            return;
         }
      System.out.println("**Transaction - Deposit**");
      System.out.println("Enter your name: ");
      user = in.next();
      for (BankAccount ele: list){
         if (ele.getName().equalsIgnoreCase(user)){
            System.out.println("Enter amount to deposit: ");
            money = in.nextDouble();
            ele.deposit(money);
            System.out.println("Name: " + user + "   Balance: " + ele.getBalance());
            return;
         }
      }
      System.out.println(user + " does not exist");
   }
   
   /**
    The removeAccount method removes 
    the specified BankAccount object from the ArrayList list.      
    @param list The list of bank accounts
    */
   public static void removeAccount(ArrayList<BankAccount> list) {
      
      // remove the specified account
      String user;
      if (list.isEmpty()){
            System.out.println("No accounts created yet!!");
            return;
         }
      System.out.println("Enter your name: ");
      user = in.next();
      for (BankAccount ele: list){
         if (ele.getName().equalsIgnoreCase(user)){
            list.remove(ele);
            System.out.println("Account deleted!!");
            return;
         }
      }
      System.out.println(user + " does not exist");
   }
   
   
}
