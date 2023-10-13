import java.util.Scanner;
public class Inheritance {
	public static void main(String[] args) {
		Officer officer = new Officer();
		Manager manager = new Manager();
		officer.getData();
	}
}
class Employee {
	Scanner sc = new Scanner(System.in);
	String name,address;
	int age;
	long salary,phonenumber;
	public void getData() {
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Age:");
		age = sc.nextInt();
		System.out.println("Enter Phone Number:");
		phonenumber = sc.nextLong();
		System.out.println("Enter Salary");
		salary = sc.nextLong();
		System.out.println("Enter Address:");
		address = sc.next();
	}
	public void printSalary() {
		System.out.println(this.salary);
	}
}
class Officer extends Employee {
	public void specialisation() {
		Scanner sc = new Scanner(System.in);
		String specialisation = sc.next();
	}
}
class Manager extends Employee {
	public void department() {
		Scanner sc = new Scanner(System.in);
		String department = sc.next();
	}
}

