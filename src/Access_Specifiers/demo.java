package Access_Specifiers;

public class demo 
{
	//1:variable
	private int a=10; //Scope of this variable is only within this class
	
	//2:default Constructor with zero parameter
	 demo()  //Scope of this constructor is within this package
	{
		int b=20;
		System.out.println(b);
	}
	 
	 //3:public constructor with parameter--> scope is throughout the project
	 public demo(int a,int b)
	 {
		 System.out.println(a+b);
	 }
	
	//4:method
	private void m1()  //private method or member:Scope only within this class
	
	{
		System.out.println("running private method: m1");
	}
	
	public void m2()  //Public Method or member :Scope is throughout the project
	{
		System.out.println("running public method: m2");
	}
	
	//default method/member: Scope is only within this package 
	//i.e.here package is Access_Specifiers

	void m3() 
	{
		System.out.println("running default method: m3");
	}
	
	//Protected method: Here also the Scope is within the package only but by using
	//Inheritance we can access it in another class of different package
	protected void m4() 
	{
		System.out.println("running protected method: m4");
	}
	
	
	
	// testing above methods in same class
	public static void main(String[] args)
	{
		demo d=new demo();
		int c=d.a;  //private :current class only
		System.out.println(c);
		d.m1(); //private: current class only
		d.m2();  //public: throughout the project
		d.m3();  //default: current package only
		d.m4();  //protected: current package and with inheritance in another package
			
	}

}
