import java.util.Scanner;

class Calculator{
	
	public int add(int n1,int n2){
	
		return n1 + n2;

	}
	
	public int add(int n1,int n2,int n3){
		
		return n1 + n2 + n3;

	}

	public double add(double n1,double n2){
		
		return n1 + n2;
	
	}
}

public class OverLoading{
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		Scanner inp = new Scanner(System.in);
		while (true){
			System.out.println("1.add 2 integer\n2.add 3 integers\n3.add 2 double");
			System.out.print("Enter your Choice: ");
			int choice = inp.nextInt();
			if (choice == 1){
				System.out.print("Enter First number: ");
				int n1 =  inp.nextInt();
				System.out.print("Enter second number: ");
				int n2 = inp.nextInt();
				System.out.println("Result: "+cal.add(n1,n2));
				System.out.println("----------------");
			}
			else if (choice == 2){
				System.out.print("Enter First number: ");
				int n1 = inp.nextInt();
				System.out.print("Enter second number: ");
				int n2 = inp.nextInt();
				System.out.print("Enter third number: ");
				int n3 = inp.nextInt();
				System.out.println("Result: "+cal.add(n1,n2,n3));
				System.out.println("----------------");
			}
			else if (choice == 3){
				System.out.print("Enter First number: ");
				double n1 = inp.nextDouble();
				System.out.print("Enter second number: ");
				double n2 = inp.nextDouble();
				System.out.println("Result: "+cal.add(n1,n2));
				System.out.println("----------------");	 
			}
			else{
				break;
			}
		}
		inp.close();

	}
}