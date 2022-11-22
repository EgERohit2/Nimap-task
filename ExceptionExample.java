//try-catch block

package types;



public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a=20;
		 int b=0;
		 
		 try {
			int c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		 finally {
			 System.out.println("try-catch is finished");
		 }
		 
		 
	}
}



