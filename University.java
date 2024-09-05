import java.util.Scanner;

class Student {
    private String name;
    private String id;
    
    private static int totalStudents = 0;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        totalStudents++; // Increment the total students count
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}

class Course {
    private String title;
    private String code;
    
    private static int totalCourses = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCourses++; // Increment the total courses count
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public void displayCourseDetails() {
        System.out.println("Course Title: " + title + ", Code: " + code);
    }
}

public class University {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of students to enroll: ");
        int numberOfStudents = inp .nextInt();
        inp.nextLine(); 

        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = inp.nextLine();
            System.out.print("ID: ");
            String id = inp.nextLine();

            students[i] = new Student(name, id);
        }

        System.out.print("Enter the number of courses to add: ");
        int numberOfCourses = inp.nextInt();
        inp.nextLine();

        Course[] courses = new Course[numberOfCourses];
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter details for course " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = inp .nextLine();
            System.out.print("Code: ");
            String code = inp.nextLine();

            courses[i] = new Course(title, code);
        }

        System.out.println("Total Students Enrolled: " + Student.getTotalStudents());
        System.out.println("Total Courses Offered: " + Course.getTotalCourses());

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayStudentDetails();
        }

        System.out.println("\nCourse Details:");
        for (Course course : courses) {
            course.displayCourseDetails();
        }
        inp.close();
    }
}
