/* Max Zaremba
 * Dr. Manar Mohammad
 * CSE 174 , Section C
 * 2/6/2019
 * Filename: Three
 * Description: Prints a list of my favorite movies, their release date and the starring actor..
 */

public class Three{
   //Prints columns that list the movie name ,release date and actor.
   public static void main(String[] args){
      System.out.printf("%-20s %-20s %-20s\n", "Movie", "Release Date",  "Starring");
      System.out.printf("%-20s %-20s %-20s\n", "******", "************",  "********");
      System.out.printf("%-20s %-20s %-20s\n", "Borat", "11/3/2006",  "Sasha Baron Cohen");
      System.out.printf("%-20s %-20s %-20s\n", "Scooby Doo", "06/08/2002", "Matthew Lillard");
      System.out.printf("%-20s %-20s %-20s\n", "Shrek", "04/22/2001", "Mike Myers");
      System.out.printf("%-20s %-20s %-20s\n", "Amadaeus", "08/19/1984", "Tom Hulce");
      System.out.printf("%-20s %-20s %-20s\n", "Star Wars Ep. V", "05/21/1980", "Mark Hamil, Harrison Ford, etc.");
      
   }
}