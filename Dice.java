//import necessary classes
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
* This application generates random numbers for a user to guess.
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-22
*/

public class Dice {
  
  /**
   * Main section of program.
  */
  
  public static void main(String[] args) {
    
    //ask the user how many dice
    System.out.println("How many dice would you like to use? (1 or 2)");
    
    //get the number of dice
    Scanner input = new Scanner(System.in);
    int numDice = input.nextInt();
    
    //declare variables
    int min = 1;
    int max = 0;
    int numGuesses = 0;
    
    //assign max value based on user input
    if (numDice == 1) {
      max = 6;
    } else if (numDice == 2)  {
      max = 12;
    } else  {
      System.out.println("Selected value out of range");
      System.exit(0);
    }
    
    //generate a random number between the specified values
    int randVal = (int) (min + (Math.random() * max));
    
    //ask the user to guess the random number
    System.out.println("Guess a random number between " + min + " and " + max);
    int userGuess = input.nextInt();
    
    //loop through user guesses until it is correct
    while (userGuess != randVal)  {
      
      //display that the guess is incorrect
      System.out.println("Incorrect, try again");
      
      //add 1 to numGuesses
      numGuesses++;
      
      //get the next user input to check
      userGuess = input.nextInt();
    }
    
    //tell the user they got it right + randVal + numGuesses
    System.out.println("You got it!");
    System.out.println("Correct number was: " + randVal);
    System.out.println("Number of guesses before correct: " + numGuesses);
  }
}