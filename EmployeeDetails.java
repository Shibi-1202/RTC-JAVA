import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    private String empId;
    private String dep;

    public Employee(String name, int age, String empId, String dep) {
        super(name, age);
        this.empId = empId;
        this.dep = dep;
    }

    public String getEmpId() {
        return empId;
    }

    public String getDep() {
        return dep;
    }

    public void displayInfo() {
	System.out.println("--------------------------------------------");

        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("Department: " + getDep());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = inp.nextLine();

        System.out.print("Enter age: ");
        int age = inp.nextInt();
        inp.nextLine(); 

        System.out.print("Enter employee ID: ");
        String empId = inp.nextLine();

        System.out.print("Enter department: ");
        String dep = inp.nextLine();

        Employee emp = new Employee(name, age, empId, dep);

        emp.displayInfo();

        inp.close();
    }
}