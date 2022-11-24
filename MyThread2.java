//case 2 : performing single task  with multiple thread

package Multithreading;

import java.util.Scanner;

class Thread2 extends Thread{
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

public class MyThread2 {

	public static void main(String[] args) {
		Thread2 t1 =new Thread2();
		t1.start();
		
		Thread2 t2 =new Thread2();
		t2.start();
		
	}

}
}
