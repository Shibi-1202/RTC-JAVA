import java.io.*;
import java.util.Scanner;

class EvenOrNot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        if(a % 2 == 0)
        {
           System.out.println(a+" is even.");
        }
        else
        {
            System.out.println(a+" is odd.");
        }
    }
}