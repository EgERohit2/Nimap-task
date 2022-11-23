//Write a program to demonstrate the "Try-Catch finally block" and explain why it is used

package types;

import java.util.Scanner;

public class ExceptionhandlingExample2 {

	public static void main(String[] args) {
		
		int k;
		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int i=sc.nextInt();
			int j = 0;
			k = i / j;
		} 
		catch(ArithmeticException e) {
			System.err.println("Exception is handled");
		}
		finally {
			// TODO: handle finally clause
			int l=105;
			int n=5;
			int o=l/n;
			System.out.println(o);
		}
		
		System.out.println("Hello");
		

	}

}
