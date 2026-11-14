import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = sc.nextInt();

        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            pascal[i][0] = 1; 
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + rows + " row(s)");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}