package proj2;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Hello my name is " + name + " and I am " + age +" years old");
		
	}

}
