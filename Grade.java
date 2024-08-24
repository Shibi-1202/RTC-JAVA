import java.io.*;
import java.util.Scanner;


class Grade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int g = input.nextInt();
        if(g >= 90 && g < 100) 
        {
            System.out.println("Grade: A");
        } 
        else if(g >= 75 && g < 90 ) 
        {
            System.out.println("Grade: B");
        } 
        else if(g >= 50 && g < 75) 
        {
            System.out.println("Grade: C");
        } 
        else if(g >= 0 && g < 50) 
        {
            System.out.println("FAIL");
        }
        else if(g >100)
        {
            System.out.println("Enter mark bewtween 100.");
        }
    }
}