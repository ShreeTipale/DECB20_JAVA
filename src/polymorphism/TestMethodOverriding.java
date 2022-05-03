package polymorphism;

public class TestMethodOverriding 
{
	public static void main(String[] args) 
	{
		Son s=new Son();
		s.money(); //output=50 //only money() method is overridden
		s.car();   //output=2
	}

}
