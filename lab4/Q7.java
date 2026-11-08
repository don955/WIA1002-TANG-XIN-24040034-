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
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = input.nextInt();

        double rate = i / (12 * 100);
        double M = (P * rate) / (1 - Math.pow(1 + rate, -N));

        System.out.printf("%-7s%-17s%-13s%-11s%-17s%-15s%n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double unpaidBalance = P;
        double totalInterest = 0;

        for (int n = 1; n <= N; n++) {
            double C = M * Math.pow(1 + rate, -(1 + N - n));
            double L = M - C;
            unpaidBalance -= C;
            totalInterest += L;

            double displayBalance = Math.abs(unpaidBalance) < 1e-4 ? 0.0 : unpaidBalance;

            System.out.printf("%-7d%-17.2f%-13.2f%-11.2f%-17.2f%-15.2f%n", n, M, C, L, displayBalance, totalInterest);
        }
    }
}
