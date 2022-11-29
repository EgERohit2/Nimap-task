package LambdaExpression;

interface Add{
	int Sum(int a,int b);
}

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add s = (a,b)-> a + b;
		
		System.out.println(s.Sum(10, 20));
	}

}
