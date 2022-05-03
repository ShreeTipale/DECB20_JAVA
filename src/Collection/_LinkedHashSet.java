package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("abc");
		lhs.add(100);
		lhs.add('A');
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs); // [abc, 100, A, null]
		System.out.println(lhs.size()); //4
		System.out.println(lhs.contains('A')); //true
		System.out.println(lhs.isEmpty()); //false
		
		lhs.remove(null);
		System.out.println(lhs); //[abc, 100, A]
		
		//printing info by using 'Iterator' cursor
		System.out.println();
		System.out.println("---print info in 'LinkedHashSet' by using 'Iterator' cursor---");
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());	
		}
		
	
		//printing info by using'for each' loop
		System.out.println();
		System.out.println("---print info in LinkedHashSet by using 'for each' loop---");
		
		for(Object h1:lhs)
		{
			System.out.println(h1);
		}
		
		//clear all data in LinkrdHashSet
		
		lhs.clear();
		System.out.println(lhs); //[]--->it shows empty 
		System.out.println(lhs.size()); //0
		
		
	}

}
