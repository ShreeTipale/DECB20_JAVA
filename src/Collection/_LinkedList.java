
package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList 
{
	public static void main(String[] args)
	{
		LinkedList LL= new LinkedList();
		
		LL.add("abc");
		LL.add(100);
		LL.add('A');
		LL.add(100);
		LL.add(null);
		LL.add(null);
		
		System.out.println(LL);  // [abc, 100, A, 100, null, null]
		System.out.println(LL.size()); //6
		System.out.println(LL.isEmpty());  //false
		System.out.println(LL.get(3));  //value at index 3=100
		System.out.println(LL.indexOf('A'));  //index of value 'A'=2
		System.out.println(LL.lastIndexOf(100));  //3
		System.out.println(LL.contains(100));  //true
		
		System.out.println();
		System.out.println(LL);  //[abc, 100, A, 100, null, null]
		
		//insert info in between LinkedList
		LL.add(3,'B');
		System.out.println(LL); //[abc, 100, A, B, 100, null, null]
		
		
		//remove info in between LikedList
		LL.remove(3);
		System.out.println(LL);  //[abc, 100, A, 100, null, null]
		
		//update/modify info in between LinkedList
		LL.set(1,"xyz");
		System.out.println(LL); //[abc, xyz, A, 100, null, null]
		
		//printing LL by using 'iterator' cursor
		System.out.println();
		System.out.println("---printing all info in LL by using 'iterator' cursor---");
		
		Iterator itr=LL.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//printing LL by using 'ListIterator' cursor
		System.out.println();
		System.out.println("---printing all info in LL by using 'ListIterator' cursor---");
		
		ListIterator Litr=LL.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		//printing LL by using 'for' loop
		System.out.println();
		System.out.println("---printing all info in LL by using 'for' loop---");
		System.out.println(LL.size());  //6
		
		for(int i=0;i<6;i++) //or (i<=LL.size()-1)  or (i<6) or (i<=5)
		{
			System.out.println(LL.get(i));
		}
		
		//printing LL by using 'for each' loop
		System.out.println();
		System.out.println("---printing all info in LL by using 'for each' loop---");
		
		for(Object F1:LL)
		{
			System.out.println(F1);
		}	
		
	}

}
