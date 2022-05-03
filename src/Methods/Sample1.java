package Methods;

public class Sample1 {
	
	//running static & non static regular method in same class

public static void main(String[] args) {
	
	m1();  //static regular method without parameter in same class
	m2(8,5);  //static regular method with parameter in same class
	Sample1 k1=new Sample1(); //non static regular method without parameter in same class
	k1.m3();
	Sample1 k2=new Sample1(); //non static regular method with parameter in same class
	k2.m4("abc@123");
	
}
	//static regular method without/zero parameter in same class
	public static void m1() {
		System.out.println("running static regular method: m1");
	}
	
	// static regular method with parameter in same class
	public static void m2(int a, int b) {
		
		System.out.println("mul 1= "+a*b);
	}
	
	//non static regular method without parameter in same class
	
	public void m3() {
	int c=8;
	int d=4;
	System.out.println("mul 2: "+ c*d);
	}
	
	//non static regular method with parameter in same class
	public void m4(String password) {
		System.out.println("password: "+password);
		
	}
}
