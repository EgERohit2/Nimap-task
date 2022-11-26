package CollectionsHierarchy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a =new ArrayList();
		a.add(23);
		a.add(4);
		a.add(31);
		a.add(35);
		a.add(45);
		System.out.println(a);
		
		ArrayList b =new ArrayList();
		b.add(10);
		b.add(987);
		b.add(36);
		b.add(2);
		b.add(5);
		System.out.println(b);
		
	    Collections.sort(a);
	    System.out.println("after asc: "+ a);
	    
	    Collections.sort(b);
	    System.out.println("after asc: "+ b);
	    
	    Collections.reverse(a);
	    System.out.println("after desc: "+ a);
	    
	    Collections.reverse(b);
	    System.out.println("after desc: "+ b);
		
		

	}

}
