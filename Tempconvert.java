import java.util.Scanner;

public class Tempconvert{

    public static void main(String[] args) {
	System.out.print("Enter Farenhiet: ");
	Scanner input = new Scanner(System.in);
	
        Double Fahrenheit = input.nextDouble();
        System.out.println(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0))
                + " celsius");
        
    }

    
}