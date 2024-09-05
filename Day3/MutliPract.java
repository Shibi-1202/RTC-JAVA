import java.util.Random;
import java.util.Scanner;

class MultiPract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true) {
            
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            
            
            System.out.println("What is " + num1 + " * " + num2 + "?");
            System.out.print("Enter your answer (or 0 to exit): ");
            int userAnswer = in.nextInt();

            
            if (userAnswer == 0) {
                System.out.println("Thank you for practicing multiplication!");
                break;
            }

            
            int correctAnswer = num1 * num2;
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }
        in.close();
    }
}
