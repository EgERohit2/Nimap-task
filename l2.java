//Write a program to demonstrate the type of access modifiers and explain why it is used
   //access modifier 
//multi-level inheritance


package types;

	class e1{
		protected int i=10;                   //access modifier 
	}
	class e2 extends e1{
	
		private int n=20;
		public void open() {
			System.out.println(i);
			
		}
		
		
	}
	
	class e3 extends e2{
		public void free() {
			
			System.out.println(i);
			
			
			
		}
	}

public class l2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	e3 ref=new e3();
	ref.free();
	

	}

}
