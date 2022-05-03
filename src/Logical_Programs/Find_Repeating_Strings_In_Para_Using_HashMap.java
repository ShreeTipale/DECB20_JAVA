package Logical_Programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Find_Repeating_Strings_In_Para_Using_HashMap
{
	public static void main(String[] args)
	{
		String str = "abc abcd abc abcd abc xyz abc abc xyz xyz xyz abcd";
		
		//convert single string into string array for getting each one an index 
		String ar[]= str.split(" ");//[abc abcd abc abcd abc xyz abc abc xyz xyz xyz abcd]
		
		//Create HashMap--->key: String type and value: Integer type
		HashMap<String,Integer> mp = new HashMap<String,Integer>();
		
		//add unique elements from String ar[] into HashMap in the form of keys and values/counts of each one
		for(int i=0;i<ar.length;i++)
		{
			String s1 = ar[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
					
		}
		Set<String> keys = mp.keySet();//[abc,abcd,xyz]
		
		//Print unique keys and their values
		for(String key : keys)
		{
			System.out.println(key+": "+mp.get(key));
		}
		
		//print values only
		Collection<Integer> allValues = mp.values();
		System.out.println(allValues);
		
		
		
		
	}
	

}
