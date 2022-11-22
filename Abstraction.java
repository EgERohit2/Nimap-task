//a)how to achieve the Abstraction in Java?
package dailyTask;

abstract class Insta {
	abstract public void login();
}

class Instagram extends Insta {
	public void login() {
		System.out.println("new implementation");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Insta ref = new Instagram();
		ref.login();
	}
}
