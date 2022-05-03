package Logical_Programs;

import java.util.HashSet;

public class Find_Duplicate_And_Unique_Elements_In_Array_Using_HashSet
{
	public static void main(String[] args) 
	{
		//que 1: remove duplicate elements and print all unique elements 
		
		 String [] ar = {"Java","JSP","Java","JSON","HTML","JSON","XML","JSP"};
		 
		 System.out.println("---remove duplicate elements and print all unique elements---");
		 HashSet<String> hs = new  HashSet<String>();
		 //add String array element one by one in HashSet
		 //In HashSet Duplicate elements are not allowed.
		 for(int i=0;i<ar.length;i++)
		 {
			 hs.add(ar[i]);
		 } 
		 
		 //storing again unique elements from HashSet into new String array
		 for(String s1 : hs)
		 {
			 System.out.println(s1);
		 }
		 
		 
		 //que 2: find and print only duplicate elements
		 System.out.println("---find and print only duplicate elements---");
		 for(int i=0;i<ar.length;i++)
		 {
			 for(int j=i+1;j<ar.length;j++)
			 {
				 if(ar[i]==ar[j])
				 {
					 System.out.println(ar[i]);
				 }
			 }
		 }
			
		
	}
	
}
