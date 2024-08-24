import java.io.*;
import java.util.Scanner;

class Leap{
	
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int yr = inp.nextInt();
		if ((yr % 4 == 0 && yr%100 != 0) || yr%400 == 0)
		{
			System.out.println(yr+" Is a Leap year");
		}
		else
		{
			System.out.println(yr+" Is not a Leap year");
		}
	
	}

}