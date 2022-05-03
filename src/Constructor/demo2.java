package Constructor;

public class demo2 
{
	int a;
	int b;
	int c;
	
	demo2(int c, int d) //this is user defined constructor with parameter
	{
		a=c;
		b=d;
	}
	
	demo2()   // this is user defined constructor without parameter
	{
		a=11;
		b=9;
	}

	demo2(int p, int q, int r)  //user defined constructor with parameter
	{
		a=p;
		b=q;
		c=r;
	}
	
	
	
	
	
	public void addition()  // non static regular method without parameter
	{
		System.out.println("addition: "+ (a+b));
	}
	
	public void multiplication()
	{
		System.out.println("multiplication: "+ (a*b));
	}
	
	public void mul()
	{
		System.out.println("mul: "+ (a*b*c));
	}
}
