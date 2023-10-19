import java.util.Scanner;
public class Inheritance {
	public static void main(String[] args) {
		Officer officer = new Officer();
		Manager manager = new Manager();
		System.out.println("Enter the Details of Officer");
		officer.officerDetails();
		System.out.println("\nEnter the Details Of Manager");
		manager.managerDetails();
	}
}
class Employee {
	Scanner sc = new Scanner(System.in);
	String name,address;
	int age;
	long salary,phonenumber;
	public void getData() {
		System.out.println("Enter Name:");
		name = sc.nextLine();
		System.out.println("Enter Age:");
		age = sc.nextInt();
		System.out.println("Enter Phone Number:");
		phonenumber = sc.nextLong();
		System.out.println("Enter Salary");
		salary = sc.nextLong();
		System.out.println("Enter Address:");
		address = sc.nextLine();
	}
	public void printDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Phone Number: "+this.phonenumber);
		System.out.println("Salary: "+this.salary);
		System.out.println("Address: "+this.address);
	}
}
class Officer extends Employee{
	String Specialisation;
	Scanner sc = new Scanner(System.in);
	public void officerDetails() {
		getData();
		System.out.println("Enter the Specialisation:");
		Specialisation=sc.next();
		printDetails();
		System.out.println("Specialisation: "+Specialisation); 
	}
}
class Manager extends Employee{
	String Department;
	Scanner sc = new Scanner(System.in);
	public void managerDetails() {
		getData();
		System.out.println("Enter Department:");
		Department=sc.next();
		printDetails();
		System.out.println("Department: "+Department);
	}
}
