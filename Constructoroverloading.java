//	Write a program to demonstrate the "Constructor Overloading" and explain why it is used

package types;

public class Constructoroverloading {
	
	public Constructoroverloading(){
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public Constructoroverloading(int x,int y) {
		int c=x+y;
		System.out.println(c);
		
	}
	
	public  Constructoroverloading(double l,double m,double n) {
		double o =(double) ((l+m)*n);
		System.out.println(o);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructoroverloading a=new Constructoroverloading(10,20);
		Constructoroverloading b=new Constructoroverloading(100,200,300);
		Constructoroverloading c=new Constructoroverloading();
		
	
	

	}

}
