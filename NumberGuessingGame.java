import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try again! Your guess is too low.");
            } else {
                System.out.println("Try again! Your guess is too high.");
            }
        }

        scanner.close();
    }
}
