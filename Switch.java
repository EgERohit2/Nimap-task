package dailyTask;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 : Area of circle");
		System.out.println("1 : Area of square");
		System.out.println("1 : Area of rectangle");
		System.out.println("1 : Area of triangle");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1-4");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			final float pi = 3.14f;

			System.out.println("Enter the radius");
			int r = sc.nextInt();

			float res1 = pi * r * r;
			System.out.println("AreaOfCircle " + res1);
			break;

		case 2:
			final int i = 4;

			System.out.println("Enter the side of a square");
			int s = sc.nextInt();

			int res2 = s * i;
			System.out.println("AreaOfSquare " + res2);
			break;

		case 3:
			final float t = 0.5f;

			System.out.println("Enter the base");
			int b = sc.nextInt();
			System.out.println("Enter the height");
			int h = sc.nextInt();

			float res3 = t * b * h;
			System.out.println("AreaOfTriangle " + res3);
			break;

		case 4:

			System.out.println("Enter the length");
			int l = sc.nextInt();
			System.out.println("Enter the breadth");
			int b1 = sc.nextInt();

			float res4 = l * b1;
			System.out.println("AreaOfrectangle " + res4);
			break;

		default:
			System.out.println("Wrong");

		}
	}
}
