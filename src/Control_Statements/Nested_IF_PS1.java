package Control_Statements;

public class Nested_IF_PS1 
{
public static void main(String[] args) 
{
	String UN="abc";
	String PWD="xyz";
	
	if (UN=="abc")
	{
		System.out.println("correct UN");
		if (PWD=="xyz")
		{
			System.out.println("correct PWD");
			System.out.println("login succesful");
		}
			
			else
			{
				System.out.println("wrong PWD");
			System.out.println("login faild");
			}
		}
	else
	{
		System.out.println("wrong UN");
		System.out.println("login faild");
	}
	}
	}
	
	
	
	
	
	
	
	
	
	

