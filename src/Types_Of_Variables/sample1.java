package Types_Of_Variables;

public class sample1 
{
	
	int a=10;  //global variable(non-static) ----scope is throughout the same class only

	
	public void m1()
	{
		int b=20;  //local variable(non static)----scope only in this method  //can't make local variable static
		System.out.println(a);  //global variable(non-static) can be accessed in any method in the same class
		System.out.println(b);  //local variable can be accessed in respective method only
	}
	
	public void m2()
	{
		int c=30;  //local variable(non static)---scope only in this method
		System.out.println(a);
		System.out.println(c);
	}
}
