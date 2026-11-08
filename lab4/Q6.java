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
public class Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(Integer.MAX_VALUE);
        System.out.println("Random integer: " + num);

        int count = 0;
        int temp = num;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
