import java.util.Scanner;

class Item {
    private String name;
    private double price;
    
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += quantity * price;
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public void displayItemDetails() {
        System.out.println("Item: " + name + ", Price: $" + price);
    }
}

public class Store {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of different items: ");
        int numberOfItems = inp.nextInt();
        inp.nextLine(); 

        Item[] items = new Item[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");

            System.out.print("Enter item name: ");
            String name = inp.nextLine();

            System.out.print("Enter item price: ");
            double price = inp.nextDouble();

            items[i] = new Item(name, price);

            System.out.print("Enter quantity sold for " + name + ": ");
            int quantity = inp.nextInt();
            inp.nextLine();  
            items[i].sell(quantity);
        }

        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());
        inp.close();
    }
}
