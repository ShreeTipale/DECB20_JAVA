package Types_Of_Variables;

public class sample2 
{
	
	static int a=11; //static global variable---scope throughout the package(called in static way) but can be called 
	                  //in different package by using import function so scope is throughout the project
	
	
	public void m1()
	{
		int b=21; //local variable (non static)--scope only in this method/block
		System.out.println(b);
		System.out.println(a);
		
	}

}
