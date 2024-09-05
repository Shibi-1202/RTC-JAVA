
import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int a = in.nextInt();
    for(int i = 0;i<=a;i++){
        if (i%2 == 0){
            continue;
        }
        else{
            System.out.print(i +" ");
        }
    }
    in.close();
}
}
