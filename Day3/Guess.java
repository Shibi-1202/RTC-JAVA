import java.util.Random;
import java.util.Scanner;

class Guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        int userGuess;
        do {
            
            System.out.print("Enter your guess: ");
            userGuess = in.nextInt();

            
            if (userGuess < randomNumber) {
                System.out.println("Too low!");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        } while (userGuess != randomNumber);
        in.close();
    }
    
}
