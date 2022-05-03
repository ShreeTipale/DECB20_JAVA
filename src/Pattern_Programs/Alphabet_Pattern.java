package Pattern_Programs;

public class Alphabet_Pattern 
{
	//1:A-F           

	//A               
	//B B
	//C C C
	//D D D D
	//E E E E E
	//F F F F F F
	
	public static void main(String[] args)
	{
		//Askey values of A-Z = 65 to 90
		//Askey values of a-z = 97 to 122
		
		
		int alpha = 65;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
		}
		
		 //2:a-f
		
		//a
		//b b
		//c c c c
		//d d d d d
		//e e e e e e
		//f f f f f f f
		System.out.println("---printing in small letters---");
		
		int alpha2 = 97;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alpha2+" ");
			}
			alpha2++;
			System.out.println();
		}	
		
	}

}
