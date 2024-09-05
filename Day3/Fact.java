import java.util.Scanner;

class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int a = in.nextInt();
        int fac = 1;

        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        
        System.out.println("The factorial of " + a + " is: " + fac);
        in.close();
    }
}
