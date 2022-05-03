package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class _HashSet1
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(100);
		al.add("abc");
		al.add('A');
		
		System.out.println(al);  //[abc, 100, A, 100, 100, abc, A]
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);  //[A, abc, 100]
		
		
	}

}
