import java.util.Scanner;

public class Program10 {
   
   //Prints results of craps game and calculates percentage of total wins.
   public static void main(String[] args) {
      Scanner kB = new Scanner(System.in);
      int rounds = 0;
      int wins = 0;
      
      System.out.print("How many rounds of craps do you want to play?");
      rounds = kB.nextInt();
      
      while (rounds <= 0) {
         System.out.print("Enter a positive number please: ");
         rounds = kB.nextInt();
      }
      
      for (int i = 0; i < rounds; i++) {
         System.out.printf("Round #%d: ", i + 1);
         if (craps()) {
            System.out.print( "(win) \n");
            wins++;
         }
         
         else {
            System.out.print( "(lose) \n");
         }
      } 
      
      System.out.println("------------------------------");
      double totalWins = (double) (wins)/(rounds) * 100;
      System.out.printf("Wins: %d out of %d (%.1f%%)", wins, rounds, totalWins);
      kB.close();
   }
   
   //Uses the Math.random method to simulate 2 dice rolls and returns their sum.
   public static int rollDice() {
      int dice = (int) (Math.random()*6 +1);
      int dice2 = (int) (Math.random()*6 +1);
      return dice + dice2;
   }
   
   //Simulates a game of craps and returns a boolean value based on game outcome.
   public static boolean craps() {
      int roll = rollDice();
      System.out.print(roll + " ");
      if (roll == 7 || roll == 11) {
         return true;
      }
      if (roll == 2 || roll == 3 || roll == 12) {
         return false;
      }
      else {
         while (true) {
            int roll2 = rollDice();
            if (roll2 == 7) {
               System.out.print(roll2+ " ");
               return false;
            }
            if (roll2 == roll) {
               System.out.print(roll2+ " ");
               return true;
            }
            System.out.print(roll2 + " ");
         }
      }
   }
}
