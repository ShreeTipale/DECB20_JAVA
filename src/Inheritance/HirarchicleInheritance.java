package Inheritance;

public class HirarchicleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("---Properties of Son1----");
		
		Son1 s1=new Son1();
		s1.laptop();
		s1.home();
		s1.money();
		s1.car();
		
		System.out.println("---properties of Son2----");
		
		Son2 s2=new Son2();
		
		s2.mobile();
		s2.home();
		s2.money();
		s2.car();
		
		
		
		
		
	}

}
