package proj2;
import java.util.Scanner;
public class Keyboard extends Data {

	public static void main(String[] args) {

     System.out.println("taking data from the keyboard ");
       Scanner sc= new Scanner (System.in);
     System.out.println("enter 1st number ");
       int a=sc.nextInt();
     System.out.println("enter 2st number ");
       int b = sc.nextInt();
        int sum=a+b;
     System.out.print("the sum of 2 num is ");
System.out.println(sum);


	}

}
