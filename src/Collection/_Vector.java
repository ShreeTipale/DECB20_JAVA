package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector 
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		
		v.add("abc");
		v.add(100);
		v.add('A');
		v.add(100);
		v.add(null);
		v.add(null);
		
		
		System.out.println(v.capacity());  //10--->default capacity 
		System.out.println(v.size()); //6--->current capacity
		System.out.println(v.isEmpty()); //false
		System.out.println(v.get(2)); //A
		System.out.println(v.indexOf(null));  //4
		System.out.println(v.lastIndexOf(null)); //5
		System.out.println(v.contains("abc"));  //true
		
		System.out.println();
		System.out.println(v); // [abc, 100, A, 100, null, null]
		
		//insert info in between vector v--->Right shifting will perform here
		v.add(3,'B'); //at index 3 new value added as 'B' also original will remaining
		System.out.println(v);  // [abc, 100, A, B, 100, null, null]
		System.out.println(v.size()); //7--->current capacity
		
		
		//remove info in between vector v--->left shifting will perform here
		System.out.println(v);
		v.remove(5); //5th index null removed
		System.out.println(v);  // [abc, 100, A, B, 100, null]
		
		//update/modify info in vector v--->replace old value with new one
		v.set(0, "xyz");  //replaced "abc" with "xyz"
		System.out.println(v);  // [xyz, 100, A, B, 100, null]
		
		//iterator cursor use for printing
		System.out.println();
		System.out.println("---print all info in vector using iterator cursor---");
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//listIterator cursor use for printing
		System.out.println("---print all info in vector v using listIterator cursor");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		//enumeration cursor use for printing
		System.out.println("---print all info in vector v using enumeration cursor---");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		//'for' loop use for printing
		
		System.out.println("---print all info in vector v using 'for' loop---");
		System.out.println(v.size()); //6
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		//'forEach' loop use for printing
		
		System.out.println("---print all info in vector v using 'for each' loop");
		for(Object h1:v)
		{
			System.out.println(h1);
		}
			
	}

}
