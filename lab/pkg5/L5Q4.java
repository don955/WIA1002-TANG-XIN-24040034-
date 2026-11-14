public class L5Q4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int n = matrix.length;
        int[][] rotated = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = matrix[n - 1 - j][i];
            }
        }

        System.out.println("3 by 3 Matrix");
        printMatrix(matrix);

        System.out.println("After rotates 90 degrees clockwise");
        printMatrix(rotated);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}