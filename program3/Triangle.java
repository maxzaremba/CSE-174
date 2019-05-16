/* Max Zaremba
 * 2/11/2019
 * File Name: Triangle
 * Description: Prints the coordinates, sides and angles of a
 * triangle based upon user imput.
 */

import java.util.Scanner;

public class Triangle{
   
   //Declares all variables
   public static void main(String[] args){
      String name;
      double sqBCx, sqBCy, sqCAx, sqCAy;
      double side1, side2, side3 ;
      double ax, ay, bx, by, cx, cy;
      double alpha, beta, gamma;
      double area, peri;
      Scanner keyboardReader = new Scanner(System.in);
      
      //User enters string name for triangle and A, B coordinate values.
      //Values for C are set.
      System.out.println("Enter the three letter name of the triangle:");
      name = keyboardReader.next();
      System.out.println("Enter the coordinates of \"" + name.charAt(0) + "\" separated by a space.");
      ax = keyboardReader.nextDouble();
      ay = keyboardReader.nextDouble();
      System.out.println("Enter the coordinates of \"" + name.charAt(1) + "\" separated by a space.");
      bx = keyboardReader.nextDouble();
      by = keyboardReader.nextDouble();
      cx = bx;
      cy = ay;
      
      //Prints coordinate values
      name = name.toUpperCase();
      System.out.println("#### Right triangle calculation for abc triangle ####");
      System.out.println("** The coordinates of the triangles are: **");
      System.out.printf(" %c : ( %.3f , %.3f )%n ",name.charAt(0), ax , ay );
      System.out.printf("%c : ( %.3f , %.3f )%n ",name.charAt(1), bx , by );
      System.out.printf("%c : ( %.3f , %.3f )%n ",name.charAt(2), cx , cy );
      
      //Calculates side lengths                   
      sqBCx = ((bx - cx) * (bx - cx));
      sqBCy = ((by - cy) * (by - cy));
      sqCAx = ((cx - ax) * (cx - ax));
      sqCAy = ((cy - ay) * (cy - ay));
      
      //Values are assigned for side length variables                   
      side1 = Math.sqrt(sqBCx + sqBCy);
      side2 = Math.sqrt(sqCAx + sqCAy);
      side3 = Math.sqrt(side2*side2 + side1*side1);
      
      //Side lengths are printed                   
      name = name.toLowerCase();
      System.out.println("** The side lengths are **");
      System.out.printf("Side" + " " + "%c : %.3f units\n",name.charAt(0), side1); 
      System.out.printf("Side" + " " + "%c : %.3f units\n",name.charAt(1), side2); 
      System.out.printf("Side" + " " + "%c : %.3f units\n",name.charAt(2), side3); 

      //Declares variables for triangle angles                   
      alpha = Math.toDegrees(Math.acos((side1*side1 + side2*side2 - side3*side3)/(2*side1*side2)));
      beta = Math.toDegrees(Math.acos((side2*side2 + side3*side3 -side1*side1)/(2*side2*side3)));
      gamma = Math.toDegrees(Math.acos((side3*side3 + side1*side1 - side2*side2)/(2*side3*side1)));
      
      //Prints angle values                   
      name = name.toUpperCase();
      System.out.println("** The angles are **");
      System.out.printf("Angle" + " %c : %.3f ",name.charAt(0), beta); 
      System.out.printf(" " + "degrees\n" );
      System.out.printf("Angle" + " " + "%c : %.3f ",name.charAt(1), gamma);
      System.out.printf(" " + "degrees\n" );
      System.out.printf("Angle" + " " + "%c : %.3f ",name.charAt(2), alpha);
      System.out.printf(" " + "degrees\n" );
      
      //Values are assigned to area and perimeter variables                   
      area = 0.5 * side1 * side2;
      peri = side1 + side2 + side3;
      
      //Area and perimeter values are printed                   
      System.out.println("** Other measurements **");
      System.out.printf("Area " + "= " + "%.3f " + "sq units\n", area);
      System.out.printf("Perimeter " + "= " + "%.3f " + "units\n", peri);
      
      keyboardReader.close();
   }
   
   
}