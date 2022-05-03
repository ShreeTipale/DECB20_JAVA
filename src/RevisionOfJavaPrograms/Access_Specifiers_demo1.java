package RevisionOfJavaPrograms;

public class Access_Specifiers_demo1 
{
	public void m1()
	{
		m2(); //non static method can get access in other non static method
		
	}
	
	private void m2()
	{
		System.out.println("Hi");
	}
	
	private static void m3()
	{
		System.out.println("Static method:m3");
		
	}
	
	public static void m4()
	{
		m3(); //one static method can get access in other static method
		//m2(); --->non static method can not get access in static method
	}

}
