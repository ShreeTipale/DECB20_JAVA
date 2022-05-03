package Abstract_Concrete_Class;

//abstract class- (we can add here some incomplete as well as complete methods also)
abstract public class Sample 
{
	//Complete method
	public void m1()      //method declaration
	{
		System.out.println("m1: completed in abstract class");       //method definition
	}
	
	//Incomplete method
	abstract public void m2();    //method declaration=incomplete non-static regular method
	
	//Incomplete method
	abstract public void m3();    //method declaration
	

}
