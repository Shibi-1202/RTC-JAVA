import java.util.Scanner;

class SchoolScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nstu = 3;
        int nsub = 4;
        int[][] scores = new int[nstu][nsub];

        String[] subjects = {"Math", "Science", "English", "History"};

        for (int i = 0; i < nstu; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < nsub; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = in.nextInt();
            }
        }

        averageScoreOfStudent(scores);

        averageScoreOfSubject(scores);
        in.close();
    }

    public static void averageScoreOfStudent(int[][] scores) {
        System.out.println("Average scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            double sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = sum / scores[i].length;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }

    public static void averageScoreOfSubject(int[][] scores) {
        System.out.println("Average scores for each subject:");
        String[] subjects = {"Math", "Science", "English", "History"};
        
        for (int j = 0; j < scores[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            double average = sum / scores.length;
            System.out.println(subjects[j] + ": " + average);
        }
    
    }

}
