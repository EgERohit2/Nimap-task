//WAP to change first letter from the string into uppercase.

package Programming;

import java.util.Scanner;

public class Logical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		String[] a=str.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			char temp= (char)(a[i].charAt(0)-32);
			a[i]=temp +a[i].substring(1);
			System.out.print(a[i]+ " ");		
		}
	
	}

}
