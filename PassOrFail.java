import java.io.*;
import java.util.Scanner;


class PassOrFail{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int mark = input.nextInt();
	System.out.println((mark>=50)?"PASS":"FAIL");

    }	
}
