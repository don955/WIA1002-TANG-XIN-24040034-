import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter point coordinates (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
       
        double distanceSquared = x * x + y * y;
        double radiusSquared = radius * radius;
        
        if (distanceSquared < radiusSquared) {
            System.out.println("Point (" + x + ", " + y + ") is INSIDE the circle.");
        } else if (distanceSquared == radiusSquared) {
            System.out.println("Point (" + x + ", " + y + ") is ON the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is OUTSIDE the circle.");
        }
        scanner.close();
    }
}
