package Array;

public class example6 
{
	public static void main(String[] args) 
	{
		// int ar[]=new int[5];  //array declaration
		// ar[0]=30;
		// ar[1]=40;
	    // ar[2]=50;
		// ar[3]=20;
		// ar[4]=10;
		
		
		
	int ar[]={30,40,50,20,10};  //declaration & initialization at a time
	
	System.out.println(ar.length);  //length i.e.total numbers are in array=5
	
	for (int i=0;i<=ar.length-1;i++)  //ar.length-1=(5-1)=4 
	{
		System.out.println(ar[i]);
	}
	
	
	}
}
