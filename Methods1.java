//getName(), setName() methods

package Multithreading;

class Thread11 extends Thread {
	public void run() {
		System.out.println("thread task");
	}
}

public class Methods1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("rohit");
		Thread11 t1 = new Thread11();
		t1.start();
		
	}

}
