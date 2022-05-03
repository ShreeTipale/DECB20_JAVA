package Pattern_Programs;

public class Alphabet_Pattern2 {

	public static void main(String[] args) {
		
		//A
		//A B
		//A B C
		//A B C D
		//A B C D E
		
		//Askey values of A-Z = 65 to 90
		//Askey values of a-z = 97 to 122
		
		int alpha =65;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		
	}
}
