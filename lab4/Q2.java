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
public class Q2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        
        int totalSum = 0;
        int currentSum = 0;
        for (int i = 1; i <= n; i++) {
            currentSum += i;
            totalSum += currentSum;
        }
        
        System.out.println("Sum of series: " + totalSum);
    } 
}
