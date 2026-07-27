import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Input range and rounds
        System.out.print("Enter the lower bound: ");
        int lowerBound = input.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = input.nextInt();
        System.out.print("Enter the number of rounds to play: ");
        int rounds = input.nextInt();
        
        // Game loop
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\n===== Round " + round + " =====");
            
            // Generate random number between lowerBound and upperBound (inclusive)
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            boolean guessedCorrectly = false;
            
            while (!guessedCorrectly) {
                System.out.print("Guess the number: ");
                int guess = input.nextInt();
                
                // Check if guess is correct
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed correctly!");
                    guessedCorrectly = true;
                } else if (Math.abs(guess - randomNumber) <= 5) {
                    // Within threshold of ±5
                    System.out.println("Well done! You're close!");
                    if (guess < randomNumber) {
                        System.out.println("But your guess is too low. Try again!");
                    } else {
                        System.out.println("But your guess is too high. Try again!");
                    }
                } else {
                    // Outside threshold
                    if (guess < randomNumber) {
                        System.out.println("Your guess is too low. Try again!");
                    } else {
                        System.out.println("Your guess is too high. Try again!");
                    }
                }
            }
        }
        
        System.out.println("\n===== Game Over! =====");
        System.out.println("Thank you for playing!");
        
        input.close();
    }
}