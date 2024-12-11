package proj2;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		System.out.println("What is your name? ");
		Scanner sc=new Scanner(System.in);
	    String str = sc.next();
		System.out.println("Hello "+ str +" How are you?");
		String ans = sc.next();
		System.out.println("Good, It was nice talking to you "+str);
		/*int a=9;
		a += 3;
		System.out.println(a);
		System.out.println(6>=6); */
		

	}

}
