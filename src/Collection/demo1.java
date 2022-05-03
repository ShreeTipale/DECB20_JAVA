package Collection;

public class demo1 
{
	
	//Print in reverse order
	public static void main(String[] args) 
	{
		String s1= "ABC XYZ KLM STR" ;
		String [] str = s1.split(" ");
		System.out.println(str[1]);  //XYZ  --->index is 1
		
		System.out.println(str.length); //4
		
		for(int i=str.length-1; i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		
		String s2= "ABCDEFG";
		String [] p1=s2.split("");
		System.out.println(p1.length); //7
		
		
		for(int j=p1.length-1; j>=0;j--)
		{
			System.out.print(p1[j]);
		}
		
		//*****
		//****
		//***
		//**
		//*
		
		System.out.println();
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
				
		}
		
		
		System.out.println();
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
				
		}
		
		System.out.println();
		int i=1;
		
		while(i<=5)
		{
			int j=5;
			while(j>=i)
			{
				System.out.print("*");
				j--;
			}
			
			System.out.println();
			i++;
				
		}
		
			
		
	}

}
