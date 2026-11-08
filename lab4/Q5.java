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
public class Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int score1 = 0;
        int score2 = 0;

        while (score1 <= 100 && score2 <= 100) {
            int roll;
            do {
                roll = rand.nextInt(6) + 1;
                score1 += roll;
                System.out.println("Player 1 rolled: " + roll + " (Total: " + score1 + ")");
                if (score1 > 100) break;
            } while (roll == 6);

            if (score1 > 100) {
                System.out.println("Player 1 wins!");
                break;
            }

            do {
                roll = rand.nextInt(6) + 1;
                score2 += roll;
                System.out.println("Player 2 rolled: " + roll + " (Total: " + score2 + ")");
                if (score2 > 100) break;
            } while (roll == 6);

            if (score2 > 100) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}
