//map method

package Steam;

import java.util.List;
import java.util.stream.Collectors;

public class mapMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(20, 30, 19, 16);
		List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumbers);

	}

}
