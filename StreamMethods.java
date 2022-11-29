package Steam;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=List.of("Rohit","Deepak","Buddy","Ashish");
		List<String>newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);

	}

}
