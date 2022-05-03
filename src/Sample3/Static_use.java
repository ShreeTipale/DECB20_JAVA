package Sample3;

public class Static_use
{
public static void main(String[] args)
{
	Emp rahul=new Emp();
	rahul.eid=101;
	rahul.esal=12000;
	rahul.ceoname="pqr";
	
	
	Emp ganesh=new Emp();
	ganesh.eid=201;
	ganesh.esal=22000;
	ganesh.ceoname="mnp";
	

	System.out.println("rahul info");
	rahul.showInfo();
	
	
	System.out.println("ganesh info");
	ganesh.showInfo();
	
	
}
}
