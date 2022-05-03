package ExceptionHandling;

public class Throw_Keyword 
{
	public void checkAge(int age)
	{
		if (age<18)
			throw new ArithmeticException("Not eligible for voting");  //Throw keyword used within method block
		
		else
			System.out.println("Eligible for voting");
	}
	
	public static void main(String[] args) 
	{
		Throw_Keyword obj = new Throw_Keyword();
		obj.checkAge(13);
		System.out.println("End of program");
			
	}

}
