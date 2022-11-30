package CollectionsHierarchy;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t= new TreeSet();
		t.add('t');
		t.add('l');
		t.add('n');
		t.add('o');
		System.out.println("ascending "+t);    //bydefault it will give ascenidng order
		
		System.out.println("descending "+t.descendingSet());
		

	}

}
