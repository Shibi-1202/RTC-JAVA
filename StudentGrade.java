import java.util.Scanner;

class Student {
    private int grade;

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }

    public int getGrade() {
        return grade;
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter the student's grade (0 to 100): ");
        int grade = inp.nextInt();

        student.setGrade(grade);

        if (grade >= 0 && grade <= 100) {
            System.out.println("The student's grade is: " + student.getGrade());
        }
        inp.close();
    }
}
