package Steam;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GettingUniqElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> numbers = List.of("12", "13", "15", "11", "12", "15","56","99","87");
//		Set<String>newnumbers=numbers.stream().collect(Collectors.toSet());
//		System.out.println(newnumbers);
//		
		List<String>num=numbers.stream().skip(3).limit(7-3+1).collect(Collectors.toList());
		System.out.println(num);
	}

}
