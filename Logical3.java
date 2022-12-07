package Programming;

import java.util.Scanner;

public class Logical3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String a = sc.nextLine();
//		String a = "january";
		char[] ch = a.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				ch[i] = '%';
			}
			a = new String(ch);
		}
		System.out.println(a);
	}
}
