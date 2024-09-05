import java.util.Scanner;

public class GradeManager {
    static class Student {
        private String name;
        private double homework;
        private double finalMark;

        public Student(String name, double homework, double finalMark) {
            this.name = name;
            this.homework = homework;
            this.finalMark = finalMark;
        }

        public double averageGrade() {
            return (homework + finalMark) / 2;
        }

        public void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Homework Grade: " + homework);
            System.out.println("Final Exam Grade: " + finalMark);
            System.out.println("Average Grade: " + averageGrade());
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = inp.nextLine();

        System.out.print("Enter homework grade: ");
        double homework = inp.nextDouble();

        System.out.print("Enter final exam grade: ");
        double finalMark = inp.nextDouble();

        Student student = new Student(name, homework, finalMark);

        student.display();
        inp.close();
    }
}
