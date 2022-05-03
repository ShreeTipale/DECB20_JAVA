package Logical_Programs;

import java.util.Scanner;

public class TakingInputFromUser_String 
{
	public static void main(String[] args) 
	{
		System.out.println("taking String input from user");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String FN = scan.nextLine();
		 
		 System.out.print("Enter your last name: ");
		 String LN = scan.next();
		 
		 System.out.println("My name is: "+ FN +" "+LN);
		
	}

}
