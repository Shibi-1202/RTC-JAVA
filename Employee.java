import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = inp.nextLine();

        double salary = -1;
        while (salary < 0) {
            System.out.print("Enter employee salary: ");
            if (inp.hasNextDouble()) {
                salary = inp.nextDouble();
                if (salary < 0) {
                    System.out.println("Salary cannot be negative. Please enter a valid salary.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value for the salary.");
                inp.next(); 
            }
        }

        Employee emp = new Employee(name, salary);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());

        inp.close();
    }
}
