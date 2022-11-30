package Steam;

import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {

		// reduced()
		List<String> stringlist = List.of("A", "E", "I", "O", "U", "1", "2", "3", "4");
		Optional<String> strList = stringlist.stream().reduce((value, combinedvalue) -> {
			return combinedvalue + value;
		});
		System.out.println(strList.get());

		// toArray()
		List<String> stringlist1 = List.of("A", "E", "I", "O", "U", "1", "2", "3", "4");
		Object arr[] = stringlist1.stream().toArray();
		for (Object v : arr) {
			System.out.println(v);
		}

	}

}
