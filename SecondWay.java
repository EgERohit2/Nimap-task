//	WAP to achieve multithreading with  Runnable interface.

package Multithreading;

public class SecondWay implements Runnable {
	public void run() {
		System.out.println("thread task");
	}

	public static void main(String[] args) {

		SecondWay s = new SecondWay();
		Thread th = new Thread(s);
		th.start();
	}

}
