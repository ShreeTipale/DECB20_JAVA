package polymorphism;

public class MethodOverloading 
{
public void addition(int a,int b)
{
	System.out.println("Addition of two numbers: "+(a+b));
}

public void addition (int a,int b,int c)
{
	System.out.println("Addition of three numbers: "+(a+b+c));
}
	
public void addition(String name,int a,int b)

{
	System.out.println(name);
	System.out.println("Addition of two numbers: "+(a+b));
}
	
}
