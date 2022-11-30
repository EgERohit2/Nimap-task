package Steam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		
		
		//sorted
		//asc
		List<Integer>list=List.of(3,4,2,1,8,6);
		List<Integer>strlist=list.stream().sorted().collect(Collectors.toList());
		System.out.println(strlist);
		//desc
		List<Integer>strlist2=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(strlist2);
		
		//asc
		List<String>list1=List.of("Rohit","Deepak","Buddy","Ashish","Shubham");
		List<String>strlist3=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(strlist3);
		//desc
		List<String>strlist1=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(strlist1);
		
		
	}

}
