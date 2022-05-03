package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Count_Repeating_Characters_In_String_Using_HashMap 
{
	public static void main(String[] args) 
	{
		
		String str = "abcabcaaad";
		
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char character = str.charAt(i);
			
			if(mp.containsKey(character))
			{
				mp.put(character, mp.get(character)+1);
			}
			else
			{
				mp.put(character, 1);
			}
		}
		
		
		Set<Character> uniqueKeys = mp.keySet();
		System.out.println("keys  Values");
		
		for(Character key:uniqueKeys)
		{
			
			System.out.println(key+": "+mp.get(key));
		}
		
		
		
		
	}

}
