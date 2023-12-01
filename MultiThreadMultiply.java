import java.util.Scanner;
public class MultiThreadMultiply {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print multiplication table in thread1");
		int number1=sc.nextInt();
		System.out.println("Enter a number to print multiplication table in thread2");
		int number2=sc.nextInt();
		System.out.println("Enter a number to print multiplication table in thread3");
		int number3=sc.nextInt();
		Thread1 thread1=new Thread1(number1);
		Thread2 thread2=new Thread2(number2);
		Thread3 thread3=new Thread3(number3);
		thread1.setPriority(1);
		thread2.setPriority(5);
		thread3.setPriority(7);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class NumberClass {
	int number;
	synchronized public void tableGenerator(int number) {
		//System.out.println("****Table of "+number+" ****");
		for (int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
	}
}

class Thread1 extends Thread {
	NumberClass numbermanager = new NumberClass();
	int number1;
	Thread1 (int number) {
		this.number1=number;
	}
	public void run() {
		numbermanager.tableGenerator(number1);
	}
}

class Thread2 extends Thread {
	NumberClass numbermanager = new NumberClass();
	int number2;
	Thread2 (int number) {
		this.number2=number;
	}
	public void run() {
		numbermanager.tableGenerator(number2);
	}
}

class Thread3 extends Thread {
	NumberClass numbermanager = new NumberClass();
	int number3;
	Thread3 (int number) {
		this.number3=number;
	}
	public void run() {
		numbermanager.tableGenerator(number3);
	}
}
