/* Max Zaremba
 * 2/25/2019
 * File Name: RockPaperScissors
 * Description: Rock, Paper, Scissors. The game.
 */

import java.util.Scanner;

public class RockPaperScissors{
   
   //Declares all variables.
   public static void main(String[] args){
      Scanner keyboardReader = new Scanner(System.in);
      String input, computer;
      int move;
      
      //Prints greeting and asks for input
      System.out.println("Welcome to \"Rock, Paper, Scissors\".");
      System.out.print("What is your move?");
      input = keyboardReader.next();
      move = (int)((Math.random()*3) + 0);
      
      //Assigns values to computer moves
      if (move == 0)
         computer = "Rock";
      else if (move == 1) 
         computer = "Paper";
      else
         computer = "Scissors";
      
      //if statement for tie 
      if (input.equalsIgnoreCase(computer)) {
         System.out.println("Human plays " + input.toLowerCase() + "." + " The Computer plays " + computer.toLowerCase() + "." + "\nTie game.");
      }
      //if statement for rock
      else if (input.equalsIgnoreCase("Rock")) {
         if (computer.equals("Paper"))
            System.out.println("Human plays Rock. The Computer Plays Paper.\nComputer wins.");
         else if (computer.equals("Scissors"))
            System.out.println("Human plays rock. The computer plays scissors.\nHuman wins.");
      }
      //if statement for paper
      else if (input.equalsIgnoreCase("Paper")) {
         if (computer.equals("Scissors"))
            System.out.println("Human plays paper. The computer plays scissors.\nHuman wins.");
         else if (computer.equals("Rock"))
            System.out.println("Human plays paper. The computer plays rock.\nHuman wins.");
      }
      //if statement for scissors
      else if (input.equalsIgnoreCase("Scissors")) {
         if (computer.equals("Rock"))
            System.out.println("Human plays scissors. The computer plays rock.\nComputer wins.");
         else if (computer.equals("Paper")) 
            System.out.println("Human plays scissors. The computer plays paper.\nHuman wins.");
      }
      //else statement for invalid input
      else {
         System.out.println("Your choices were rock, paper, or scissors! What about that was so hard to understand?");
      }
      
      keyboardReader.close();    
      
   }
}
