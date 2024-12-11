package proj2;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		double val= 1.609;
		System.out.println("Km to miles Converter ");
		System.out.println("Enter Km: ");
		Scanner sc=new Scanner (System.in);
		double a=sc.nextDouble();
		double ans=a/val;
		System.out.println(a + " Km = "+ ans+" miles");
		
		
	}

}
