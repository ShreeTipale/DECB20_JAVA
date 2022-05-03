package Varible_DT;
import java.util.Scanner;

public class Taking_input 
{
	public static void main(String[] args) 
	{
		System.out.println("taking input from user");
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter no 1");
		 int a= sc.nextInt();
		
		System.out.println("Enter no 2");
		 int b= sc.nextInt();
		
		int sum=a+b;
		System.out.println("The sum of these numbers is: "+sum);
		
	}

}
