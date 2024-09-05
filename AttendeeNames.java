import java.util.Scanner;

class AttendeeNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] names = new String[5];

        System.out.println("Enter the names of 5 attendees:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = in.nextLine();
        }
        //for each
        String longestName = names[0];
        String shortestName = names[0];
        for (String x : names) {
            if (x.length() > longestName.length()) {
                longestName = x;
            }
            if (x.length() < shortestName.length()) {
                shortestName = x;
            }
        }

        System.out.println("Names in Reverse Order:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
        in.close();
    }
}
