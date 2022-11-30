package Steam;
import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer>numbers=List.of(20,13,28,30,13,20,30);
		Map<Object, List<Integer>>newnumbers=numbers.stream().collect(Collectors.groupingBy(num-> num));
		System.out.println(newnumbers);
	}


	}


