import java.util.Scanner;

class SumOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int a = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        
        System.out.println("The sum of numbers from 1 to " + a + " is: " + sum);
        in.close();
    }
}
