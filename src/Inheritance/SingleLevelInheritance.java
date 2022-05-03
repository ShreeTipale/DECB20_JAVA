package Inheritance;

public class SingleLevelInheritance
{
	public static void main(String[] args) 
	{
		//static method calling
		Son.m1();  //or Father.m1();
		Son.m2();
	
		//non static methods calling
		Son s= new Son ();
		s.bike();  //son class property
		s.car();   //father class property
		s.money();   //father class property
		s.home();   //father class property
		
		
		
		
		
	}

}
