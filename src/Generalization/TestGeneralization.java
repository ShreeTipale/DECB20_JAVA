package Generalization;

public class TestGeneralization 
{
	
	public static void main(String[] args)
	{
		System.out.println("----Features of Jio Simcard----");
		System.out.println();
		
		Jio j=new Jio();
		
		j.audiocalling();
		j.sms();
		j.internet();
		j.newFeatureA();
		
		System.out.println();
		System.out.println("----Features of Idea Simcard----");
		System.out.println();
		
		Idea i=new Idea();
		
		i.audiocalling();
		i.sms();
		i.internet();
		i.newFeatureB();
		
		
		
	}

}
