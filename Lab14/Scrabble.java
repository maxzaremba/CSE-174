/* Max Zaremba
 * CSE 174
 * 5/10/2019
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class Scrabble{
   
   public static void main(String[] args)throws FileNotFoundException {
      ArrayList<String> words = new ArrayList<String>();
      String[] scramble = new String[1000];
      File reader = new File("scrambled.txt");
      Scanner in = new Scanner(reader);
      int count = 0;
      while (in.hasNext()){
         String line = in.next();
         scramble[count] = line;
         count++;
         if (count == 1000){
            break;
         }
         
      }
      String temp;
      

         for ( int i = 0;  i < scramble.length - 1;  i++ ){
            for ( int j = 0;  j < scramble.length - 1;  j++ ){
               if ( scramble[j].compareTo(scramble[j+1]) > 0 ){                                             
                  temp = scramble[j];
                  scramble[j] = scramble[j+1];     // swapping
                  scramble[j+1] = temp; 
               } 
            } 
         } 
         System.out.println(scramble[529]);
      
      File outputFile = new File("sorted.txt");
      PrintWriter out = new PrintWriter(outputFile);
      for (int x = 0; x < 1000; x++){
         out.println(scramble[x]);
      }
      out.close();
   }
   
}
