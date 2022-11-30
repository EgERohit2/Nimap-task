package Steam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		List<Integer> numberlist = List.of(2, 4, 5, 6);
		List<Integer> multipliednumberlist = new ArrayList();
		multipliednumberlist = numberlist.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println(multipliednumberlist);

	}

}
