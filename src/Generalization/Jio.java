package Generalization;

public class Jio implements Simcard
{
	public void audiocalling()
	{
		System.out.println("audio calling: unlimited");
	}
	
	public void sms()
	{
		System.out.println("sms: 500");
	}
	
	public void internet()
	{
		System.out.println("internet: 2 GB");
	}
	
	public void newFeatureA()   //new method in Jio class
	{
		System.out.println("new feature: A");
		
	}
	
	
	

}
