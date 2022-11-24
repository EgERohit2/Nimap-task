//case 3 : performing multiple task  with multiple thread

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
}
	
	class Lemon extends Thread{
		public void run() {
			System.out.println("thread task");
		}
	}

public class MyThread3 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		t1.start();
		
		Lemon l2=new Lemon();
		l2.start();
		
		
		

	}

}

