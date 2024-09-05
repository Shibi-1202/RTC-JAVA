import java.util.Scanner;

class StudentScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] scores = new int[5];


        System.out.println("Enter the scores of 5 students:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = in.nextInt();
        }


        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;


        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }


        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        in.close();
    }
}
