//	Write a program to demonstrate the "Inheritance" and explain why it is used
//constructor
//super calling statement

package types;

class a1{
	int i=10;
	
	public a1(int i){
		this.i=i;
		
		System.out.println("hello");
		
	}
	
}

class p2 extends a1{
	
	int i=20;
public p2(){
		
	super(10);
		System.out.println("bro");
		
	}
	
}

public class l1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 ref=new p2();
		System.out.println(ref.i);

	}

}
