import java.util.Scanner;

class GreetStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        in.nextLine(); 

        String[] students = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = in.nextLine();
        }

        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
        in.close();
    }
}
