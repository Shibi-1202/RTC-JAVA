import java.util.Scanner;

class Bank{
	
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		double newBal;
		System.out.print("Current Balance : ");
		double bal = inp.nextDouble();
		System.out.println("");
		System.out.print("Withdrawal amount : ");
		double with = inp.nextDouble();
		System.out.print("\n");
		if (bal >= with)
		{	newBal = bal - with;
			System.out.print("Withdrawal Successful. New Balance: "+newBal);
		}
		else
		{
			System.out.print("Error: Insufficeint Balance.");
		}
			
	}

}