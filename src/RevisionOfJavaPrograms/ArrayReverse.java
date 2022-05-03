package RevisionOfJavaPrograms;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6};
		int L = arr.length;//array length=6 stored in L 
		
		int n=Math.floorDiv(L, 2);
		//gives greatest integer after dividing L by 2 i.e 6/2=3 
		//and n is a mid point of array up to where we've to reverse values
		
		int temp; //temporary location /empty area for moving element
		
		//we want to continue for loop up to mid point of array
		//here n is a mid point but it's a length and index of mid point is 2
		//so condition as per index is i<=(n-1)=3-1=2nd index
		
		//step 1:index '0'th element i.e.arr[0]=1 moves in temp and it becomes temp=1
		//step 2:arr[0] is empty now so we have to fill arr[5]=6 into it
		//step 3:arr[L-i-1]=arr[6-0-1]=arr[5]=6 it will go in arr[i] and arr[5] becomes empty
		//step 4:now it becomes arr[i]=arr[0]=6
		//step 5:fill arr[5] with temp and it becomes arr[5]=1
		for(int i=0;i<=n-1;i++)
		{
			
			temp=arr[i];
			arr[i]=arr[L-i-1];
			arr[L-i-1]=temp;
		}
		//print result using for each loop
		for(int ele : arr)
		{
			System.out.print(ele+" ");
		}
		
	}

}
