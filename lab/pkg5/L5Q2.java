import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            int num = rand.nextInt(21); 
            boolean isDuplicate = false;

            
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.print("10 non-duplicate random integers (0-20): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}