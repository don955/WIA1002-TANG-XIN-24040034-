import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        int[][] workHours = new int[n][7];

        System.out.println("\nEmployee\tDay1\tDay2\tDay3\tDay4\tDay5\tDay6\tDay7\tTotal");
        for (int i = 0; i < n; i++) {
            int totalHours = 0;
            System.out.print("Employee " + (i + 1) + "\t");

            for (int j = 0; j < 7; j++) {
                workHours[i][j] = rand.nextInt(8) + 1; 
                totalHours += workHours[i][j];
                System.out.print(workHours[i][j] + "\t");
            }
            System.out.println(totalHours);
        }
    }
}