package Types_Of_Variables;

public class TestSample2 
{
	public static void main(String[] args) 
	{
		
		 int k=sample2.a;       //syntax for calling static global variable from diff class
		System.out.println(k);  //classname.variable name;
		
		/* variable gives value so we can store it in different object as per 
		 *  its data type.(here int k=sample2.a;)
		 *  or simply we can print statement as follows:
		 *  
		 *  System.out.println(sample2.a);------>it will print value of 'a'
		 *  
		 */
		
		
		
		sample2 s2=new sample2();
		s2.m1();
		
	}

}
