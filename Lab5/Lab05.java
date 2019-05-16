/* Max Zaremba
 * 3/1/2019
 * File Name: Lab05
 * Description: Calculates user's BMI and categorizes it.
 */

import java.util.Scanner;

public class Lab05{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      Double height, weight, bmi;
      
      //Asks user for weight and height
      System.out.println("Please enter your weight in pounds : ");
      weight = keyboardReader.nextDouble();
      System.out.println("Plese enter your height in inches : ");
      height = keyboardReader.nextDouble();
      
      //Calculates BMI
      bmi = (703 * weight)/(height * height);
      
      //Prints BMI value
      System.out.printf("Your BMI is %.2f.\n", bmi);
      
      //If - then statements for BMI
      if (bmi < 18.5) {
         System.out.print("Underweight");
      }
      else if (bmi <= 24.9 && bmi >= 18.5) {
         System.out.println("Normal");
      }
      else if (bmi >= 25.0 && bmi <= 29.9) {
         System.out.println("Overwight");
      }
      else {
         System.out.println("Obese");
      }
      
      keyboardReader.close();    
      
   }
}

