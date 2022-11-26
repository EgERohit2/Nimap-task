package CollectionsHierarchy;

import java.util.Vector;

public class Vector_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		v.add(1);
		v.add("hi");
		v.add(true);
		v.add(null);
		v.add("hi");
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.capacity());

	}

}
