package proj2;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = scanner.nextDouble();
        System.out.println("Enter width:");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

	}

}
