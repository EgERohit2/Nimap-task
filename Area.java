//   e)program in Area of All Shapes

package dailyTask;

import java.util.Scanner;



class Shapes {
	
	public void AreaOfCircle() {
		final float pi = 3.14f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = sc.nextInt();

		float res1 = pi * r * r;
		System.out.println("AreaOfCircle " + res1);
	}

	public void AreaOfSquare() {
		final int i = 4;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square");
		int s = sc.nextInt();

		int res2 = s * i;
		System.out.println("AreaOfSquare " + res2);
	}

	public void AreaOfTriangle() {

		final float t = 0.5f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int b = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the height");
		int h = sc1.nextInt();

		float res3 = t * b * h;
		System.out.println("AreaOfTriangle " + res3);
	}

	public void AreaOfrectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int l = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the breadth");
		int b = sc1.nextInt();

		float res4 = l * b;
		System.out.println("AreaOfrectangle " + res4);

	}

}

public class Area {

	public static void main(String[] args) {
		Shapes ref = new Shapes();
		ref.AreaOfSquare();
		System.out.println("---------------------");

		ref.AreaOfCircle();
		System.out.println("---------------------");

		ref.AreaOfTriangle();
		System.out.println("---------------------");

		ref.AreaOfrectangle();
		System.out.println("---------------------");
		
		
	}

}
