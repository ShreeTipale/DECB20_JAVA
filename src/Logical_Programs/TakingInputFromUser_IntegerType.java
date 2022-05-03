package Logical_Programs;

import java.util.Scanner;

public class TakingInputFromUser_IntegerType 
{
	public static void main(String[] args) 
	{
		System.out.println("taking integer input from user");
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.print("Enter no 1: ");
		 int a= sc.nextInt();
		
		System.out.print("Enter no 2: ");
		 int b= sc.nextInt();
		
		int sum=a+b;
		System.out.println("The sum of two integer numbers is: "+sum);
		
	}


}
