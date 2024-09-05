import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nstu = 5;
        int nsub = 2;
        int[][] grades = new int[nstu][nsub];

        for (int i = 0; i < nstu; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            grades[i][0] = in.nextInt();
            System.out.print("Science: ");
            grades[i][1] = in.nextInt();
        }

        printGrades(grades);

        printAverageGrades(grades);
        in.close();
    }

    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }

    public static void printAverageGrades(int[][] grades) {
        double sumMath = 0;
        double sumScience = 0;

        for (int[] grade : grades) {
            sumMath += grade[0];
            sumScience += grade[1];
        }

        double averageMath = sumMath / grades.length;
        double averageScience = sumScience / grades.length;

        System.out.println("Average Math grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
    }
}
