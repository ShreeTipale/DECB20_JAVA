package Constructor;

public class Test_demo2
{
	public static void main(String[] args) 
	{
		demo2 d2=new demo2(10,20);
		d2.addition();
		d2.multiplication();
		
		System.out.println("------------------");
		
		demo2 c2=new demo2();
				c2.addition();  //here addition of 11+9 will happen
				c2.multiplication(); //mul of 11 and 9 will happen
				
				System.out.println("---------------");
				demo2 e2=new demo2(2,4,8);
				e2.mul();
			
				
		
		
	}

}
