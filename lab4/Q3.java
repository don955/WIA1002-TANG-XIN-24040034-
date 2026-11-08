/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        double sum = 0;
        double sumSquare = 0;

        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            double score = input.nextDouble();
            if (score < 0) {
                break;
            }
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
            sum += score;
            sumSquare += score * score;
            count++;
        }

        if (count > 0) {
            double avg = sum / count;
            double variance = (sumSquare - (sum * sum / count)) / (count - 1);
            double stdDev = Math.sqrt(variance);

            System.out.printf("Minimum Score: %.0f%n", min);
            System.out.printf("Maximum Score: %.0f%n", max);
            System.out.printf("Average Score: %.2f%n", avg);
            System.out.printf("Standard Deviation: %.2f%n", stdDev);
        }
    }
}
