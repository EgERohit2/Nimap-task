package Steam;

import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Distinct
		List<String> VehicleList = List.of("car", "bus", "truck", "cycle", "motorbike", "bus", "truck");
//		List<String>distinctvehicles=VehicleList.stream().distinct().collect(Collectors.toList());
		VehicleList.stream().distinct().forEach(value -> System.out.println(value));
//		System.out.println(distinctvehicles);

		// count
		long count = VehicleList.stream().distinct().count();
		System.out.println(count);

		// limit()
		VehicleList.stream().distinct().limit(3).forEach(value -> System.out.println(value));

	}

}
