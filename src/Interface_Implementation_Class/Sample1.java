package Interface_Implementation_Class;

//Multiple inheritance is performing 
//implementation class(Sample1)is sub class here and I1,I2 are two super interfaces(like super classes)

public class Sample1 implements I1,I2
{
	public void m1()
	{
		System.out.println("m1:from interface I1 is completed");
	}
	
	public void m2()
	{
		System.out.println("m2:from interface I1 is completed");
	}
	
	public void m3()
	{
		System.out.println("m3:from interface I2 is completed");
	}
	
	public void m4()
	{
		System.out.println("m4:from interface I2 is completed");
	}

}
