package types;

class Whatsappversion1 {
	long numbers;
	String name;

	Whatsappversion1() {

	}

	Whatsappversion1(long numbers, String name) {
		this.numbers = numbers;
		this.name = name;
	}

	public void details() {
		System.out.println("Name " + name);
		System.out.println("Number " + numbers);
	}

	public void send() {
		System.out.println("u can send image");
	}

}

class Whatsappversion2 extends Whatsappversion1 {
	long numbers;
	String name;

	public void details() {
		super.details();
	}

	public void send() {
		super.send();
		System.out.println("You can send images");
		System.out.println("You can send videos");
		System.out.println("You can send live location");
	}

	public void videocall() {
		System.out.println("you can now enjoy free video call");
	}
}

public class Whatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Whatsappversion1 ref1 = new Whatsappversion1(8080980450l, "Rohit");
		ref1.details();
		ref1.details();

		System.out.println("------------------------------------------------------------------");

		Whatsappversion2 ref2 = new Whatsappversion2();
		ref2.send();
		ref2.videocall();

	}
}
