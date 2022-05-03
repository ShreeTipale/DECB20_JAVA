package Access_Specifiers;

public class TestDemo 
{

	public static void main(String [] args)
	{
		demo d=new demo();
		//d.m1();    //private: it is not accessing in this(other)class
		d.m2();   // public: throughout the project
		d.m3();   //default: within the current package
		d.m4();    //protected: current package and with inheritance in another package
	}
	
}
