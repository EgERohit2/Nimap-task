package LambdaExpression;

interface One{
	void palin();
}

public class Palindrome {

	public static void main(String[] args) {
		
		Runnable t2=()->
		{
			String s="Level";
			String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			if(s.equalsIgnoreCase(rev)) {
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("String is not palindrome");	
			}
		};
		Thread t22=new Thread(t2);
		t22.start();

	}

}
