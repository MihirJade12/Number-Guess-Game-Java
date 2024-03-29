import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Can you guess it?");

        while (true) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts
                        + " attempts.");
                break;
            }
        }
    }
}