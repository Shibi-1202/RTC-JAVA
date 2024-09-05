import java.util.Scanner;

class Employee {
   
    String name;
    int id;
    double baseSalary;
    double allowances;

    Employee() {
    }


    Employee(String name, int id, double baseSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.allowances = allowances;
    }


    double grossSalary() {
        return baseSalary + allowances;
    }


    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + baseSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + grossSalary());
        System.out.println(" ");
    }
}

public class Salary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = inp.nextInt();
        inp.nextLine(); 

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = inp.nextLine();
            
            System.out.print("ID: ");
            int id = inp.nextInt();
            
            System.out.print("Basic Salary: ");
            double baseSalary = inp.nextDouble();
            
            System.out.print("Allowances: ");
            double allowances = inp.nextDouble();
            inp.nextLine();
            
            employees[i] = new Employee(name, id, baseSalary, allowances);
        }

        System.out.println("\nEmployee Salary Details:");
        System.out.println(" ");
        for (Employee employee : employees) {
            employee.display();
        }
        inp.close();
    }
}
