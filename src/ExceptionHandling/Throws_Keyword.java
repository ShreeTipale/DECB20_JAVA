package ExceptionHandling;

public class Throws_Keyword 
{
	public int division(int a,int b) throws ArithmeticException  //Throws keyword used with method signature
	{
		int t=a/b;
		return t;
	}
	
	public static void main(String[] args)
	{
		Throws_Keyword obj = new Throws_Keyword();
		
		try
		{
			System.out.println(obj.division(15, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("You should not divide number by zero");
			
		}
		
	}

}
