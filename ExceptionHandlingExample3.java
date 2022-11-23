package types;

import java.util.Scanner;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {
		
		try {
	
			int i = 25;
			int j = 5;
			int k = i / j;
			
			int a[]=new int[4];
			for(int c=0;c<=5;c++) {
				a[c]=c+1;
			}
			for(int value : a) {
				System.out.println(value);
			}
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Number cannot be divided by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong value ");
		}
		
		
		

	}

}
