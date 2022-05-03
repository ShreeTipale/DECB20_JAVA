package Pattern_Programs;

public class Number_Pattern_Diamond {

	public static void main(String[] args) {
		
		//1 2 3 4 5
		// 2 3 4 5
		//  3 4 5
		//   4 5
		//    5
		//   4 5
		//  3 4 5
		// 2 3 4 5
		//1 2 3 4 5
		
		
		int num =5;
		
		for(int i=1;i<=num;i++)
		{
			for(int s=1;s<i;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=num;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		for(int i=num-1;i>=1;i--)
		{
			for(int s=i-1;s>=1;s--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=num;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}
