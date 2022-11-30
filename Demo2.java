package Steam;

import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {

		// min()
		List<Integer> numberList = List.of(157, 19, 32, 42, 55, 68, 79, 84, 96);
		Optional<Integer> min = numberList.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(min.get());

		// max()
		Optional<Integer> max = numberList.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(max.get());

	}

}
