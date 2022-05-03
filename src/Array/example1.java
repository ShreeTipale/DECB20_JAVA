package Array;


public class example1
{
	public static void main(String[] args) 
	{
		
		
		String ar[]=new String [5]; //5 block array object creation
		ar[0]="ganesh";
		ar[1]="mahesh";
		ar[2]="suresh";
		ar[3]="ramesh";
		ar[4]="rahul";
		
		System.out.println(ar[0]);//ganesh
		
		ar[0]="ganesh1";  //re-initialization of array block 0th number
		System.out.println(ar[0]);//ganesh1
		
		System.out.println("-----Printing array-----");
		//Printing all array elements
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----Printing cloned array----");
		String p[] = ar.clone();
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
	}

}
