class MultiplicationTable {
	synchronized void printTable(int number) {
		for (int i=1;i<=10;i++) {
			System.out.println(number+" x "+i+" = "+number*i);
		}
	}
}

class myThread extends Thread {
	MultiplicationTable t =new MultiplicationTable();
	myThread (MultiplicationTable t) {
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printTable(5);
	}
}

class myThread2 extends Thread {
	MultiplicationTable t =new MultiplicationTable();
	myThread2 (MultiplicationTable t) {
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printTable(7);
	}
}

public class Multiply {
	public static void main(String[] args) {
		System.out.println("MULTIPLICATION TABLE");
		MultiplicationTable m = new MultiplicationTable();
		myThread thread = new myThread(m);
		myThread2 thread2 = new myThread2(m);
		thread2.setPriority(2);
		thread2.start();
		thread.start();
	}
}