package proj2;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a=sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b=sc.nextInt();
		if(a==b) {
			System.out.print("equal ");
		}
		else if(a>b) {
			System.out.print(a + " is greater ");
		}
		else {
			System.out.print(a + " is lesser ");
		}
		
	}

}
