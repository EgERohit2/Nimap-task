package Multithreading;

public class FirstWay extends Thread{
	
	public void run() {
		System.out.println("thread task ");
	}

	public static void main(String[] args) {
			
		FirstWay n =new FirstWay();
		n.start();

	}

}
