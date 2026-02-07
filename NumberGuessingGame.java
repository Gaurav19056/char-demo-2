import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        /* “इस गेम में वित्तीय जोखिम का एक तत्व शामिल है और इसकी लत लग सकती है।
           कृपया जिम्मेदारी से और अपने स्वयं के जोखिम पर ही इसे खेलें” */

        // Initialize Scanner for input and Random for number generation
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int noOfGuesses = 0;
        int guessedNumber;

        System.out.println("Welcome to the Number Guessing Game!");

        // Loop until the user guesses the correct number
        do {
            System.out.print("Guess the number (1-100): ");
            guessedNumber = sc.nextInt();
            noOfGuesses++;

            if (guessedNumber > randomNumber) {
                System.out.println("Lower number please!!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Higher number please!!");
            } else {
                System.out.println("Congrats!!");
            }

        } while (guessedNumber != randomNumber);

        System.out.println("You guessed the number in " + noOfGuesses + " guesses.");
        
        sc.close(); // Good practice to close the scanner
    }
}