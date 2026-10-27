import java.util.Scanner;

public class    q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = scanner.next().charAt(0);
        
        switch (operand) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operand.");
        }
        scanner.close();
    }
}