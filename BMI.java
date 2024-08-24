import java.io.*;
import java.util.Scanner;


class BMI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Weight : ");
        double w = input.nextDouble();
	System.out.print("Enter Your Height : ");
	double h = input.nextDouble();
	double hm = h/100;
	double BMI = w/(hm*hm);
	if (BMI < 18.5)
	{
		System.out.println("BMI:"+BMI+",Category:Under Weight");
	}
	else if (BMI>=18.5 && BMI<24.9)
	{
		System.out.println("BMI:"+BMI+",Category:Normal Weight");
	}
	else if (BMI>=25 && BMI<29.9)
	{
		System.out.println("BMI:"+BMI+",Category:OverWeight");
	}
	else
	{
		System.out.println("BMI:"+BMI+",Category:Obesity");

	}
    }
}