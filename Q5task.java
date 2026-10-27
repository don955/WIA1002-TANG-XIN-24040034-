import java.util.Scanner;

public class Q5task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");
        // Read input coefficients as double variables to support decimal values
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        
        // Calculate the determinant (ad - bc)
        double denominator = (a * d) - (b * c);
        
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            // Apply Cramer's Rule: x = (ed - bf) / (ad - bc), y = (af - ec) / (ad - bc)
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            
            // Display results formatted to 2 decimal places
            System.out.printf("x = %.2f, y = %.2f\n", x, y);
        }
        
        scanner.close();
    }
}