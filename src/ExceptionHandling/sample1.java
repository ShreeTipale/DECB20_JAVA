package ExceptionHandling;

public class sample1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
		
		//output: Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at ExceptionHandling.sample1.main(sample1.java:9)
		
	}

}
