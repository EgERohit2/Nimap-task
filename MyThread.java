//case 1 : performing single task  with single thread

package Multithreading;

import java.util.Scanner;

class Thread1 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the range");
		int range = sc.nextInt();

		int i = 1;
		while (i <= range) {
			System.out.println(num + "*" + i + "=" + num * i);
			i++;
	}
}

public class MyThread {
	

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		t1.start();
	}

}
}
