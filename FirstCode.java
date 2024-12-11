package proj2;
import java.util.Scanner;
public class FirstCode {

	public static void main(String[] args) {
		float total=500;
	 System.out.println("The persentage calculator ");
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the 1st subj marks: ");
	 float a=sc.nextFloat();
	 System.out.println("Enter the 2nd subj marks: ");
	 float b=sc.nextFloat();
	 System.out.println("Enter the 3rd subj marks: ");
	 float c=sc.nextFloat();
	 System.out.println("Enter the 4th subj marks: ");
	 float d=sc.nextFloat();
	 System.out.println("Enter the 5th subj marks: ");
	 float e=sc.nextFloat();
	 float sum=a+b+c+d+e;
	 System.out.print("The total marks is: ");
	 System.out.println(sum);
	 float per=(sum/total)*100;
	 System.out.print("The persentage is:");
	 System.out.println(per);

	 
	 

	}

}
