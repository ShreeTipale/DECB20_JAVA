package ExceptionHandling;

import java.util.InputMismatchException;

public class sample3 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=0;
		
		
		try
		{
			c=a/b; //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException Handled");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException handeled");
		}
		catch(Exception e)
		{
			System.out.println("generic exception handeled");
		}
		System.out.println(c);
		System.out.println("Hi..");
		
	}

}
