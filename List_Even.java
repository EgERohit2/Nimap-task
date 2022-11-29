package Steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Even {

	public static void main(String[] args) {

		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(2);
		list2.add(30);
		list2.add(43);
		list2.add(50);
		System.out.println(list2);

		//without stream
		List<Integer> list3 = new ArrayList<>();
		for (Integer i : list2) {
			if (i % 2 == 0) {
				list3.add(i);
			}
		}
		System.out.println(list2);
		System.out.println(list3);
		
		//using stream
		Stream <Integer>stream  = list2.stream();
		List<Integer>newList = stream.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		//one-line only
		List<Integer>newList1 = list2.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(newList1);
		
		
				
	    
	}

}
