package CollectionsHierarchy;

import java.util.ArrayList;

public class ArrayList_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a =new ArrayList();
		a.add('a');
		a.add(null);
		a.add("Hello");
		a.add('a');
		a.add(true);
		System.out.println(a);
		
		ArrayList b =new ArrayList();
		b.add(b);
		b.add(null);
		b.add("world");
		b.add(1);
		b.add(false);
		System.out.println(b);
		a.add(b);
		System.out.println(a);
		
		System.out.println(a.contains("Hello"));
		
		a.add(1, "New");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		System.out.println("No. of size: "+ b.size());
		
		for (int i = 0; i < a.size(); i++) {           //1) access objects from collection using 
			System.out.println(a.get(i));                  // get index method
		}
		
		for(Object obj : a) {                         //1) access objects from collection using 
			System.out.println(a);                        //for each loop
		}
		
		

	}

	}

