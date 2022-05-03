package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(); //it is homogeneous class-->only one type of info can be added at a time
		
		ts.add(100);
		ts.add(300);
		ts.add(200);
		ts.add(200);
		ts.add(600);
		ts.add(500);
		ts.add(400);
		ts.add(400);
	
		System.out.println(ts); //[100, 200, 300, 400, 500, 600]  //order of insertion--->Ascending
		
		System.out.println(ts.size()); //6
		
		//removing first element in TreeSet--->pollFirst();
		ts.pollFirst();
		System.out.println(ts);  //[200, 300, 400, 500, 600]
		
		//removing last element in TreeSet--->pollLast();
		ts.pollLast();
		System.out.println(ts);  //[200, 300, 400, 500]
		
		//adding new elements in TreeSet
		ts.add(100);
		ts.add(600);
		System.out.println(ts);  //[100, 200, 300, 400, 500, 600]
		
		//printing info by using 'Iterator' cursor
		System.out.println();
		System.out.println("---print info in TreeSet by using Iterator cursor---");
		 Iterator itr = ts.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 //printing info by using 'for each' loop
		 System.out.println();
		 System.out.println("---print info in TreeSet by using 'for each ' loop");
		 
		 for(Object t1:ts)
		 {
			 System.out.println(t1);
		 }
		 
		 //**printing info in descending order by using 'descendingIterator' cursor
		 
		 System.out.println();
		 System.out.println("---printing info in descending order by using 'descendingIterator' cursor---");
		 
		 Iterator ditr = ts.descendingIterator();
		 while(ditr.hasNext())
		 {
			 System.out.println(ditr.next());
		 }
		
		
	}

}
