package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class _HashSet 
{
	public static void main(String[] args)
	{
		HashSet HS = new HashSet();
		
		HS.add("abc");
		HS.add(100);
		HS.add('A');
		HS.add(100);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);//[null, A, abc, 100]
		System.out.println(HS.size()); //4
		System.out.println(HS.contains(100));  //true
		System.out.println(HS.isEmpty()); //false
		
		HS.remove(null);
		System.out.println(HS); //[A, abc, 100]
		
		//printing info by using 'Iterator' cursor
		System.out.println();
		System.out.println("---print info in HashSet by using 'Iterator' cursor---");
		
		Iterator itr = HS.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//printing info by using 'for each' loop
		System.out.println();
		System.out.println("---print info in HashSet by using 'for each' loop---");
		
		for(Object s1:HS)
		{
			System.out.println(s1);
		}
		
		//clear the all values in HashSet i.e zero size
		System.out.println();
		System.out.println("---clear the all elements of HashSet---");
		
		HS.clear();
		System.out.println(HS.size());
	
		
	}

}
