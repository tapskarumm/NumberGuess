package NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /*I will create a guessing game which 
  * greets the user
  * gives instructions
  * generate a random number within a specified range, i'm thinking 50-100
  * ask user to guess a number, so allow inputs 
  * compare the user's guess with the generated number
  * give feedback on whether its too high or low
  * use loop to ask user to enter again until correct
  * display the number of attempts made by the user
  */
		
		System.out.println("_________");
		System.out.println("");
		
		// Greet user and give instructions for the game
		System.out.println("Hi! Welcome to the Guessing Game! You will need to guess a number between 0-50. You have unlimited attempts. Good luck!");
  
		// Create a Random object
		Random random = new Random();
		
		// Generate a random number between 1 and 50
		int randomNum = random.nextInt(50) +3; 
		// Add 3 to the generated number
		
		// Create Scanner object for user input 
		Scanner scanner = new Scanner(System.in);
		
		// Initializes useer's guess
		int guess = 0;
		
		// Count the number of attempts
		int attempts =0;
		
		// Allow the user to keep guessing 
		while (guess != randomNum) {
			System.out.println("Guess the number: ");
			
		// Validate user input
			if (!scanner.hasNextInt()) {
				System.out.println("Please enter a valid interger!");
				
		// Discard the invalid input
				scanner.next(); 
				
		// Continue to next part of loop
				continue; 
			}
			
		// Read the user's guess
			guess = scanner.nextInt(); 
			attempts++;
			
			
		// Provide feedback on the guess
			if (guess > randomNum) {
				System.out.println("The number is too high! Try again.");
			}else if (guess < randomNum) {
				System.out.println("The number is too low! Try again.");
			}else {
				System.out.println("Congratulations! The correct number was indeed " + randomNum + "!");
				System.out.println("It took you " + attempts + " attempts to guess the number.");
				System.out.println(" ");
				System.out.println("Thank you for playing the game!");
			}
		
		}
		
		scanner.close();
		System.out.println(" ");
		
		System.out.println("Go Hatters!!");
		System.out.println(" ");
		System.out.println("Program by: Tapiwa Karumekayi");
		System.out.println(" ");
		
		System.out.println("_________");
		
		
		
		
		
	}

}
