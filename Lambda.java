package LambdaExpression;

@FunctionalInterface
interface a  {
	void show();
}

//class b implements a{
//	public void show() {
//		System.out.println("hello world");
//	}
//}

public class Lambda {

	public static void main(String[] args) {

		a obj = () -> {
			System.out.println("hello everyone");
		};
		obj.show();
		Runnable t2 = () -> {
			try {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i * 2);
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		Thread t22 = new Thread(t2);
		t22.start();

	}
}
