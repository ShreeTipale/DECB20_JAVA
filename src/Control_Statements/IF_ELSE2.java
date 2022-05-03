package Control_Statements;

public class IF_ELSE2 {
	public static void main(String[] args) {
		int  marks =25;
		
		if (marks>100)
		{
		System.out.println("invalid marks");
		}
		
		else if(marks>64)
		{
			System.out.println("distinction");
		}
		else if(marks>59)
		{
			System.out.println("1st class");
		}
		else if (marks>49)
		{
			System.out.println("2nd class");
		
		}
		else if(marks>34)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}
	}
}
