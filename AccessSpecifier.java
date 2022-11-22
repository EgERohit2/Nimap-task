//access modifier implementation in Java?

package dailyTask;

class one{
	private int i=10;
	protected int j=20;
	public int k=30;
	
}
class two extends one{
	public  void first() {
		System.out.println("protected are accessible" +" " +j);
		System.out.println("public are accessible" + " " + k);
		
	}
}

public class AccessSpecifier {

	public static void main(String[] args) {
		
		two obj=new two();
		obj.first();
		
		
	}

}
