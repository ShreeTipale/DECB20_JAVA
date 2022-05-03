package Methods;

import Methods2.Regular_method_diff_class;

public class Sample3 
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		
		k1();
		Sample3 t3=new Sample3 ();
		t3.k2();
		
		Regular_method_diff_class.m2();
		
		
		System.out.println("main method ended");
		
		
	}
	
	public static void k1()
	{
		System.out.println("running static regular method in same class:k1 ");
	}
	
	public void k2()
	{
		System.out.println("running non static regular method in same class:k2 ");
	}

}
