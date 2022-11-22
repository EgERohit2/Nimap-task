//how to achieve Inheritance in Java method overloading,method overriding?

package dailyTask;

class product {
	public static void prod(int x, int y) {
		int c = x * y;
		System.out.println(c);
	}

	public static void prod(double l, double m, double n) {
		double o = l * m * n;
		System.out.println(o);
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		product obj = new product();
		obj.prod(10, 20);
		obj.prod(2.5, 4.9, 6.57);
	}
}
