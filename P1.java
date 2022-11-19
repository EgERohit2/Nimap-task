//Write a program to demonstrate the "Method Overloading" and explain why it is used
//- class is having same method name with diffrent parameters ,either differ in length or differ in 
//  datatype


package types;

public class P1 {
	
	public void test() {               //same method name with no formal argument
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	public void test(int x,int y) {       //same method name diffrent parameters 
		int c=x+y;
		
		System.out.println(c);
}
	
	public void test(double l, double m, double n) {    //same method name diffrent datatype 
		double o =(double) ((l+m)*n);
		System.out.println(o);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P1 a=new P1();
		a.test();
		a.test(13, 16);
		a.test(30.00, 100.00, 150.00);
		

	}

}
