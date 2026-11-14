import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of students must be greater than 0.");
            return;
        }

        int[] scores = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = rand.nextInt(101); 
            sum += scores[i];
        }

        int highest = scores[0];
        int lowest = scores[0];

        System.out.print("List of scores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / n;
        System.out.println();
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f%n", average);
    }
}
