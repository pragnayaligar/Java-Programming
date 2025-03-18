package proj2;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter button number: ");
		int button=sc.nextInt();
		if(button==1) {
			System.out.print("Hello ");
		}else if(button==2) {
			System.out.print("Namaste");
		}else if(button==3) {
			System.out.print("Bonjure");
		}else {
			System.out.print("invalid!");
		}
	}

}
