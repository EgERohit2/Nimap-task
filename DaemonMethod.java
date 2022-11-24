//isDaemon method

package Multithreading;

class Task1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}
		else {
			System.out.println("child thread");
		}
		}
	}


public class DaemonMethod {

	public static void main(String[] args) {
		System.out.println("main thread");
		
		Task1 t1=new Task1();
		t1.setDaemon(true);
		t1.start();
		
	}

}
