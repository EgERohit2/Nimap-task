package Programming;

public class Logical4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,32,23,89,65,4,2,45};
		int large=a[0];
		int slarge=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				slarge=large;
				large=a[i];
			}
			else if (a[i]>slarge && a[i]!=large) {
				slarge=a[i];
			}
		}
		System.out.println(slarge);
	}

}
