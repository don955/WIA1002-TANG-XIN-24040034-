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
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDayOfYear = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febDays = isLeap ? 29 : 28;

        int firstDayOfMay = (firstDayOfYear + 31 + febDays + 31 + 30) % 7;
        int firstDayOfAug = (firstDayOfYear + 31 + febDays + 31 + 30 + 31 + 30 + 31) % 7;

        String headerFormat = "%-5s%-5s%-5s%-5s%-5s%-5s%-5s%n";
        String colFormat = "%-5s";

        System.out.println("          May " + year);
        System.out.printf(headerFormat, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayOfMay; i++) {
            System.out.printf(colFormat, "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf(colFormat, i);
            if ((i + firstDayOfMay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");

        System.out.println("          August " + year);
        System.out.printf(headerFormat, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayOfAug; i++) {
            System.out.printf(colFormat, "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf(colFormat, i);
            if ((i + firstDayOfAug) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
