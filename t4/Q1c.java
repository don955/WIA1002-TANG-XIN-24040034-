/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

/**
 *
 * @author Administrator
 */
public class Q1c {
    public static void main(String[] args) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print((int)(Math.random() * 101) + "\t");
            }
            System.out.println();
        }
    }
    
}
