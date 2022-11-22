//throw keyword

package types;
public class ExceptionHandlingExample {
	
	   void checknumber(int n) {
		if(n<18) {
			throw new ArithmeticException("n should be greater than 18");
		}
		else {
			System.out.println("n is elligible");
		}
	}
	
	public static void main(String[] args) {
//		checknumber(15);           //for static method 
		
		 ExceptionHandlingExample ref=new  ExceptionHandlingExample();
		 ref.checknumber(15);
	}

}
