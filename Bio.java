import java.io.*;
import java.util.Scanner;
class Bio{
	public static void main(String[] arg){
		Scanner inp = new Scanner(System.in);
		String name;
		char gen;
		int age;
		double hi;
		double wi;
		System.out.print("Enter your name: ");
		name= inp.nextLine();
		System.out.print("Enter your age: ");
		age= inp.nextInt();
		System.out.print("Enter your gender: ");
		gen= inp.next().charAt(0);
		System.out.print("Enter Height: ");
		hi= inp.nextDouble();
		System.out.print("Enter Weight: ");
		wi= inp.nextDouble();
		System.out.println("BIODATA");
		System.out.println("Student name: "+name);
		System.out.print("Student age:");
		System.out.println(age);
		System.out.println("Student gender: "+ gen);
		System.out.print("Student Height:");
		System.out.println(hi);
		System.out.print("Student Weight:");
		System.out.println(wi);
	}

}