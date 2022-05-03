package Control_Statements;

public class SWITCH
{
	public static void main(String[] args) 
	{
		String input="BI";
		
		switch (input) 
		{
		
		case "BI":System.out.println("Balance inquiry"); break;
			
		case "CWD":System.out.println("Cash Withdrawal"); break;
		
		case "MT":System.out.println("Money Transfer"); break;
		
		case "MS":System.out.println("Mini Statement"); break;
		
		

		default: System.out.println("invalid input"); break;
			
		}	
		
	}

}
