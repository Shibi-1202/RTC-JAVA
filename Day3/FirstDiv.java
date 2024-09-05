import java.util.Scanner;

class FirstDiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Enter the upper limit: ");
        int n = in.nextInt();

        
        System.out.print("Enter the divisor: ");
        int d = in.nextInt();

        boolean found = false;

        
        for (int i = 1; i <= n; i++) {
            if (i % d == 0) {
                System.out.println("The first number divisible by " + d + " is " + i + ".");
                found = true;
                break;
            }
        }

        
        if (!found) {
            System.out.println("No numbers between 1 and " + n + " are divisible by " + d + ".");
        }
        in.close();
    }
}
