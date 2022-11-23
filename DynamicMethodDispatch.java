//WAP to demonstrate Dynamic method dispatch

package types;

class One {
	public void on() {
		int i = 10;
		System.out.println("It is on with super-class");

	}

	public void free() {
		System.out.println("It is free");
	}
}

class Two extends One {
	int j = 20;

	public void on() {
		System.out.println("It is on with sub-class");
	}

	public void open() {
		System.out.println("It is open");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		Two obj1 = new Two();
		obj1.on();
		obj1.open();

		One obj2 = new One();
		obj2.on();
		obj2.free();

		One obj3 = new Two(); // upcasting
		obj3.free();
		obj3.on();
//   	obj3.open();       it is not allowed ,but we can access it by downcasting

//		Two t=(Two) obj3;    //downcasting
//		System.out.println(t.j);
//		t.open();
	}

}
