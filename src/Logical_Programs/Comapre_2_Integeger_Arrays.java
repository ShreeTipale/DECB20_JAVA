package Logical_Programs;

import java.util.Arrays;

public class Comapre_2_Integeger_Arrays 
{
	public static void main(String[] args) 
	{
		//1D Array(for comparing 1D array use Arrays.equals())
		int [] ar1 = {10,20,30};
		int [] ar2 = {40,50,60}; 
		int [] ar3 = {40,50,60};
		
		System.out.println(Arrays.equals(ar1, ar2)); //false
		System.out.println(Arrays.equals(ar1, ar3)); //false
		System.out.println(Arrays.equals(ar2, ar3)); //true
		
		//2D Array(for comparing multidimensional array use Arrays.deepEquals())
		int [][] p1 = {{10,20,30},{40,50,60}};
		int [][] p2 = {{10,20,30},{40,50,60}};
		
		System.out.println(Arrays.deepEquals(p1, p2));//true
		
		
	}

}
