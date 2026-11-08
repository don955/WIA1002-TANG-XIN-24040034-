/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

/**
 *
 * @author Administrator
 */
public class Q1e {
 
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 25; i++) {
            sum += (double) i / (26 - i);
        }
        System.out.printf("%.2f%n", sum);
    }
    
}
