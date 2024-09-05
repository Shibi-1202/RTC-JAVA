import java.util.Scanner;

class Calculator {

    double add(double num1, double num2) {
        return num1 + num2;
    }

    double sub(double num1, double num2) {
        return num1 - num2;
    }

    double mult(double num1, double num2) {
        return num1 * num2;
    }

    double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean cont = true;

        while (cont) {
            System.out.print("Enter the first number: ");
            double num1 = inp.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = inp.nextDouble();

            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            int choice = inp.nextInt();

            double result = 0;
            boolean validOp = true;

            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.sub(num1, num2);
                    break;
                case 3:
                    result = calc.mult(num1, num2);
                    break;
                case 4:
                    result = calc.div(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    validOp = false;
            }

            if (validOp && !(choice == 4 && num2 == 0)) {
               
                System.out.println("The result is: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = inp.next();

            if (!response.equalsIgnoreCase("yes")) {
                cont = false;
                System.out.println("Thank you for using the Calculator. Goodbye!");
            }
        }
        inp.close();
    }
}
