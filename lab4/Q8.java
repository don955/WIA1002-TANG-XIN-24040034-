/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
import java.util.Random;
public class Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        System.out.println("Generated n: " + n);
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
}
