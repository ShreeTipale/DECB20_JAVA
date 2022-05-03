package Casting;

public class Upcasting 
{
	public static void main(String[] args)
	{
		father d=new son();  //create object of sub class & provide reference of superclass
		
		
		d.money();  //money=50 will be returned to father (modified money)
		d.car();   //original car=2 will be returned to father
	
		
	}

}
