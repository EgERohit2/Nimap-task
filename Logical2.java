package Programming;

import java.util.Scanner;

public class Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 21, 33, 35, 46, 90, 54 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int search = sc.nextInt();
//		int search=90;
		boolean b = true;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("the index is present at :" + " " + i);
				b = false;
				break;
			}

		}
		if (b == true) {
			System.out.println("the element is not present");
		}

	}

}
