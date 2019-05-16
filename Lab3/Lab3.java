/* Max Zaremba
 * 2/15/2019
 * File Name: Lab3
 * Description: Prints the name and average test score of a student.
 */

import java.util.Scanner;

public class Lab3{
   
   public static void main(String[] args){
      String fname, lname;
      Double score1, score2, score3, avg, min, max, med ;
      Scanner keyboardReader = new Scanner(System.in);
      
      System.out.printf("Enter the student's first name and last name :");
      fname = keyboardReader.next();
      lname = keyboardReader.next();
      
      System.out.printf("Enter 3 scores; each separated by a space.");
      score1 = keyboardReader.nextDouble();
      score2 = keyboardReader.nextDouble();
      score3 = keyboardReader.nextDouble();
      
      fname = fname.toUpperCase();
      lname = lname.toUpperCase();
      System.out.printf("Name : " + fname + " " + lname.charAt(0));
      
      
      avg = (score1 + score2 + score3)/3;
      min = Math.min(score1, Math.min(score2, score3));
      max = Math.max(score1, Math.max(score2, score3));
      med = score1 + score2 + score3 - min - max;
      
      System.out.printf("\n%s %.2f\n", "Average = ",  avg, "." );
      System.out.printf("%s %.2f\n", "Mimimum = ", min, "." );
      System.out.printf("%s %.2f\n", "Median = ", med, "." );
      System.out.printf("%s %.2f\n", "Maximum = ", max, "." );
      keyboardReader.close();
   }
}