package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class _ArrayList 
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList(5);
		
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		
		
		System.out.println(al);  //[abc, 100, a, 100, null, null]
		System.out.println(al.size()); //6
		System.out.println(al.isEmpty());  //false
		System.out.println(al.get(3));  //index 3 value=100
		System.out.println(al.get(0)); //index 0 value=abc
		System.out.println(al.contains("abc"));  //true
		System.out.println(al.indexOf('A')); //2
		System.out.println(al.lastIndexOf(100));  //3
		
		
		//insert info between ArrayList--->existing data from old index will shift rightwards of new inserted data
		
		System.out.println(al);  //[abc, 100, A, 100, null, null]
		al.add(2,55.5f);    //at 2nd index--->add 55.5
		System.out.println(al);  //[abc, 100, 55.5, A, 100, null, null]
		
		//remove or delete info in between ArrayList--->existing data of right side of the removed data will shift to 
		//left side
		

		al.remove(2);  //remove 2nd index data
		System.out.println(al);  //[abc, 100, A, 100, null, null]--->55.5 removed
		
		//update or modify info in ArrayList
		
		al.set(0, "xyz");  //o'th index data replaced by xyz
		System.out.println(al);  //[xyz, 100, A, 100, null, null]
		System.out.println();
		
		//iterator cursor function
		
		System.out.println("----print all info in arralist using 'iterator' cursor----");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("----print all info in arraylist using 'listIterator' cursor ");
		
		ListIterator Litr = al.listIterator();
		
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println();
		System.out.println("----print all info in arraylist using 'for' loop----");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		System.out.println("----print all info in arraylist using 'foreach' loop");
		
		for(Object s1:al)  //we can use any variable name like s1,t2,shree,...etc
		{
			System.out.println(s1);
		}
		
	}

}
