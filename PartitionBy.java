package Steam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=List.of(1,4,5,3,7,9,35,32,29);
		Map<Boolean,List<Integer>>numberlist=list.stream().collect(Collectors.partitioningBy(k->k>10));
		System.out.println(numberlist);
	}

}
