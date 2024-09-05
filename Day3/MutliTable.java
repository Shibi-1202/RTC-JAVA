
import java.util.Scanner;

public class MutliTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter multiplication table : ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i*j + "    ");
            }
            System.out.println("");
        }
        in.close();
    }
    
}
