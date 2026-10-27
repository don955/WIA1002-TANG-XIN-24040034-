import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int p1_roll1 = rand.nextInt(6) + 1;
        int p1_roll2 = rand.nextInt(6) + 1;
        int p1_total = p1_roll1 + p1_roll2;
        
        int p2_roll1 = rand.nextInt(6) + 1;
        int p2_roll2 = rand.nextInt(6) + 1;
        int p2_total = p2_roll1 + p2_roll2;
        
        System.out.println("Player 1 rolls: " + p1_roll1 + " and " + p1_roll2 + " (Total: " + p1_total + ")");
        System.out.println("Player 2 rolls: " + p2_roll1 + " and " + p2_roll2 + " (Total: " + p2_total + ")");
        
        if (p1_total > p2_total) {
            System.out.println("Player 1 wins!");
        } else if (p2_total > p1_total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}