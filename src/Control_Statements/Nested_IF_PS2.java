package Control_Statements;

public class Nested_IF_PS2 
{
	public static void main(String[] args) 
	{
		String UN=("abc");
		String PWD=("xyz");
		
		if(UN=="abc2")
		{
			System.out.println("correct UN");
	
			
			if (PWD=="xyz")
			{
				System.out.println("correct PWD");
				System.out.println("logim succesful");
			}
			else
			{
				System.out.println("wrong PWD");
				System.out.println("login failed");
			
			}
		}
		
		else
		{
			System.out.println("wrong UN");
			System.out.println("login failed");
		}
		
	}

}
