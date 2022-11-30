package Steam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {

		List<String> list = List.of("rohit", "hello", "world", "egeroht");
		List<String> listinUpperCase = new ArrayList<String>();

		// without using stream
		/*
		 * for(String names : list) { listinUpperCase.add(names.toUpperCase()); }
		 * System.out.println(listinUpperCase);
		 */

		// using stream
		listinUpperCase = list.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(listinUpperCase);
	}

}
