/* Max Zaremba
 * 4/15/2019
 * File Name: Program 11
 * Description: User enters a UPC and the program returns the sum of even and odd indexes,
 * the weighted sum, the last digit of the weighted sum, the check digit and the code's validity.
 */

import java.util.Scanner;

class Program11 {

 //asks user for upc and prints calculations
 public static void main(String[] args) {
  Scanner kB = new Scanner(System.in);
  int[] upcArray = new int[12];
  
  System.out.print("Enter the UPC that you want to check:");
  String upc = kB.nextLine();
  
  String[] upcString = upc.split(" ");
  
  //converts the string array upcArray to int
  for (int i = 0; i < upcString.length; i++) {
   upcArray[i] = Integer.parseInt(upcString[i]);
  }
  
   int even = evenSum(upcArray);
   int odd = oddSum(upcArray);
   int weight = (odd) * 3 + even;
   
   System.out.println("The sum of the digits in the odd numbered positions = " + odd);
   System.out.println("The sum of the digits in the even numbered positions = " + even);
   System.out.println("The weighted sum = " + weight);
   System.out.println("The last digit of the weighted sum = " + weight % 10);
   System.out.println("The check digit = " + check(weight));
   System.out.println("The bar code you entered is " + upc);
   
   if (check(weight) == upcArray[11]) {
     System.out.print("The bar code is valid.");
    }
    else {
     System.out.println("The bar code is invalid.");
    }
    kB.close();
 }
 
 //returns the sum of the even indexes in upcArray
 public static int evenSum(int[] upcArray) {
  int values = 0;
  for (int i = 0; i < upcArray.length - 1; i++) {
   if (i % 2 != 0) {
   values += upcArray[i];
   }
  } 
  return values;
 }
 
 //returns the sum of the even indexes in upcArray
 public static int oddSum(int[] upcArray) {
  int values = 0;
   for (int i = 0; i <= upcArray.length - 1; i+=2) {
    values += upcArray[i];
   }
   return values;
 }
 
 //returns the calculated check digit
 public static int check(int weight) {
  if (weight % 10 == 0) {
   return 0;
  }
  else {
   return 10 - weight % 10;
  }
 }
}
