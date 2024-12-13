package proj2;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        double result = calculateResult(num1, operator, num2);
        System.out.println("Result: " + result);
    }

    private static double calculateResult(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
            default:
                System.out.println("Error: Invalid operator.");
                return 0;
        }
	}

}
