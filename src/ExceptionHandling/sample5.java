package ExceptionHandling;

public class sample5
{
	public static void main(String[] args)
	{
	//nested try block
		
		try
		{
			try
			{
				//risky code
			}
			catch(Exception e)
			{
				//event handled message
			}
		}
		catch(Exception e)
		{
			//event handled message
		}
		
	}

}
