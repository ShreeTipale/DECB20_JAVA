package Pattern_Programs;

public class Pattern13
{
	//****
	//***
	//**
	//*     row=7
	//**    column=4
	//***
	//****
	
	public static void main(String[] args) 
	{
		int star = 4;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
				
			if(i<=3)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
	}

}