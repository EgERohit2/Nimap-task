//ways to create stream object

package Steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// 1. Blank
		Stream<Object> stream = Stream.empty();

		// 2. arrays,collection
		String names[] = { "Rohit", "Deepak", "Buddy" };
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});

		// 3
		Stream<Object> stream2 = Stream.builder().build();

		// 4
		IntStream stream3 = Arrays.stream(new int[] { 10, 20, 30 });
		stream3.forEach(e -> {
			System.out.println(e);
		});
		
		//5
		List<Integer>list4=new ArrayList();
		list4.add(11);
		list4.add(22);
		list4.add(33);
		list4.add(44);
		Stream<Integer> stream5 =list4.stream();
		stream5.forEach(e->{
			System.out.println(e);
		});
		
	}

}
