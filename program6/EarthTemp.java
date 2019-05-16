/* Max Zaremba
 * 3/6/2019
 * File Name: EarthTemp
 * Description: Measures the Earth's temperature at given depth.
 */

import java.util.Scanner;

public class EarthTemp{
   
   //Declares all variables. 
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      double depth, celsius, fahrenheit;
      
      //Prints input instructions
      System.out.println("Enter the depth in kilometers: ");
      depth = keyboardReader.nextDouble();
      
      //Calls getCelsiusAtDepth method and prints the temperature
      celsius = getCelsiusAtDepth(depth);
      System.out.println("The celsius temperature at depth " + depth + " is " + celsius);
      
      //Calls convertCelsiusToFahrenheit and prints the temperature
      fahrenheit = convertCelsiusToFahrenheit(celsius);
      System.out.println("The Fahrenheit temperature at depth " + depth + " is " + fahrenheit);
      
      keyboardReader.close();
   }
   
   //Method used to calculate the depth temperature in celsius
   public static double getCelsiusAtDepth(double depth){
      double celsius = 10 * depth + 20;
      return celsius;
   }
   
   //Method used to convert the depth temperature to fahrenheit
   public static double convertCelsiusToFahrenheit(double celsius){
      double fahrenheit = 1.8 * celsius + 32;
      return fahrenheit;
   }
}