package This_Super_Keyword;

//Sub class
public class demo2 extends demo1  //here inheritance used for acquiring properties of demo1 into demo2
{
	//int a=50; global variable of super class
	
	int a=60; //global variable of sub class
	

	
	
	public void m2()
	{
		int a=70; //local variable
		
		System.out.println(a);  //output:70
		System.out.println(this.a);  //output:60
		System.out.println(super.a);  //output:50
	}

}
