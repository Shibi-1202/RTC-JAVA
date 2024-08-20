import java.util.Scanner;
class Bill{
	public static void main(String[] arg){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter item 1: ");
		String item1 = inp.nextLine();
		System.out.print("Enter quantity: ");
		int q1 = inp.nextInt();
		System.out.print("Enter price: ");
		double p1 = inp.nextDouble();
		inp.nextLine();

		System.out.print("Enter item 2: ");
		String item2 = inp.nextLine();
		System.out.print("Enter quantity: ");
		int q2 = inp.nextInt();
		System.out.print("Enter price: ");
		double p2 = inp.nextDouble();
		inp.nextLine();

		System.out.print("Enter item 3: ");
		String item3 = inp.nextLine();
		System.out.print("Enter quantity: ");
		int q3 = inp.nextInt();
		System.out.print("Enter price: ");
		double p3 = inp.nextDouble();

		System.out.println("Item:"+item1+"\tQuantity:"+q1+"\tPrice:$"+p1);  
		System.out.println("Item:"+item2+"\tQuantity:"+q2+"\tPrice:$"+p2);  
		System.out.println("Item:"+item3+"\tQuantity:"+q3+"\tPrice:$"+p3);
		
	}
}