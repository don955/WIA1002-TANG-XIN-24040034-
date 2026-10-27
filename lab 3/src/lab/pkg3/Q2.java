import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(6); // 生成 0 到 5 之间的随机整数
        
        String word;
        switch (num) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            default: word = "unknown"; break;
        }
        
        System.out.println(num + " is " + word + ".");
    }
}
