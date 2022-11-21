//	Write a program to demonstrate the "Polymorphism" and explain why it is used
//1.Compile time binding  2.run-time binding
//1.1 variable shadowing
//-which variable to be used is decided by the compiler during compile time
//  i)based on  reference variable type
// ii) not based on which object created

//1.2 method shadowing
//-which method to be used is decided by the compiler during compile time
//  i)based on  reference variable type
// ii) not based on which object created





package types;


class e4{
	int i=10;
	public void open() {                                       //formal argument should be same
		System.out.println("Super-class");
	}
}

class e5 extends e4{
	int i=20;
	public void open() {                                      //formal argument should be same
		System.out.println("sub-class");
	}
}

public class l3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		e4 ref1=new e4();                
		System.out.println(ref1.i);
		ref1.open();
		
		e5 ref2=new e5();
		System.out.println(ref2.i);
		ref2.open();
		
		e4 ref3=new e5();                          //upcasting
		System.out.println(ref3.i);
		
		ref3.open();
		

	}

}
