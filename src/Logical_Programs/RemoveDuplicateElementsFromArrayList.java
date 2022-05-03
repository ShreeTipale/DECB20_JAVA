package Logical_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList
{
	public static void main(String[] args)
	{
		//Way 1:using LinkedHashSet:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,6));
		//pass object of ArrayList in LinkedHasSet for removing duplicate numbers
		LinkedHashSet<Integer> numlist = new LinkedHashSet<Integer>(numbers);
	
		//create fresh new ArrayList without duplicatesnumbers and print it
		ArrayList<Integer> numWithoutDuplicates = new ArrayList<Integer>(numlist);
		System.out.println(numWithoutDuplicates);
		
		//Way 2:Using stream:
		ArrayList<Integer> Marks = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,6));
		 List<Integer> UniqueMarks = Marks.stream().distinct().collect(Collectors.toList());
		
		System.out.println(UniqueMarks);
		
	}
	
	

}
