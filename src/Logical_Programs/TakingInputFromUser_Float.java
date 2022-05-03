package Logical_Programs;

import java.util.Scanner;

public class TakingInputFromUser_Float 
{
	public static void main(String[] args) 
	{
		System.out.println("Taking float type input from user");
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal no.1: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Enter decimal no.2: ");
		float num2 = sc.nextFloat();
		
		float sum = (num1+num2);
		System.out.print("The sum of two decimal numbers is: "+sum);
	}
		

}
