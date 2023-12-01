import java.util.Random;
public class MultiThreading {
	public static void main(String[] args) {
		NumberManager manager = new NumberManager();
		NoGeneratorThread Thread1 = new NoGeneratorThread(manager);
		SquarePrinterThread Thread2 = new SquarePrinterThread(manager);
		CubePrinterThread Thread3 = new CubePrinterThread(manager);
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}

class NumberManager {
	boolean isNumberGenerated = false;
	int generatedNumber;
	synchronized public void numberGenerator() {
		generatedNumber = new Random().nextInt(9)+2;
		System.out.println("The Generated Number is: "+generatedNumber);
		isNumberGenerated = true;
		notifyAll();
	}
	synchronized public void squarePrinter() throws InterruptedException {
		while (isNumberGenerated==false || generatedNumber%2!=0) {
			wait();
		}
		System.out.println("The square of "+generatedNumber+" is "+generatedNumber*generatedNumber);
		isNumberGenerated = false;
	}
	synchronized public void cubePrinter() throws InterruptedException {
		while (isNumberGenerated==false || generatedNumber%2==0) {
			wait();
		}
		System.out.println("The cube of "+generatedNumber+" is "+generatedNumber*generatedNumber*generatedNumber);
		isNumberGenerated = false;
	}
}

class NoGeneratorThread extends Thread {
	NumberManager numbermanager = new NumberManager();
	NoGeneratorThread (NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run() {
		while(true) {
			numbermanager.numberGenerator();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class SquarePrinterThread extends Thread {
	NumberManager numbermanager = new NumberManager();
	SquarePrinterThread (NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run() {
		while(true) {
			try {
				numbermanager.squarePrinter();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CubePrinterThread extends Thread {
	NumberManager numbermanager = new NumberManager();
	CubePrinterThread (NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run() {
		while(true) {
			try {
				numbermanager.cubePrinter();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}