import java.util.Scanner;

class PascalTri {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        // Prompt the user to enter a positive integer n
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        final int n = in.nextInt();

        // Generate and display Pascal's Triangle
        for (int i = 0; i < n; i++) {
            int number = 1; // Initialize the first number in the row

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println();
        }
        in.close();
    }
}
