package This_Super_Keyword;

public class Sample001 
{
	//this keyword usage: to access global variable of same class into the same class method
	
	 int a=30;  //global(non-static) variable

	public void m1()
	{
		int a=20;  //local variable
		System.out.println(a);  //output:20
		System.out.println(this.a); //(syntax: this.variable name)---output:30
		
	}

}
