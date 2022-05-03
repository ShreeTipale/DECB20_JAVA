package Array;

public class example2
{
	public static void main(String[] args) 
	{
		String ar[]=new String[5];
		ar[0]="ganesh";
		ar[1]="mahesh";
		ar[2]="suresh";
		ar[3]="ramesh";
		ar[4]="rahul";
		
		
		System.out.println(ar.length); //output =5
		
		for(int i=0; i<=(ar.length-1);i++)
		{
			System.out.println(ar[i]);
		}
		
		    //or
		// for(int i=0; i<=4; i++)
		//{
		//System.out.println(ar[i]);
		//}
		
	}

}
