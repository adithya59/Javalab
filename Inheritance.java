import java.util.Scanner;
public class Inheritance {
	public static void main(String[] args) {
		Officer officer = new Officer();
		Manager manager = new Manager();
		officer.getData();
		Officer of=new Officer();
		Manager Ma=new Manager();
		System.out.println("Enter the Details of Officer");
		of.setDetails();
		of.setSpecialization();
		of.getDetails();	
		of.getSpecialization();
		System.out.println("Enter THE Details Of Manager");
		Ma.setDetails();
		Ma.setDepartment();
		Ma.getDetails();
		Ma.getDepartment();	
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
	void getSpecialisation() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Specialisation:");
	    Specialization=sc.nextLine();
	}
	 void printSpecialization() {
	    System.out.println("Specialisation: "+Specialization); 
	 }
}
class Manager extends Employee{
	String Department;
	Scanner sc = new Scanner(System.in);
	void getDepartment() {
		System.out.println("Enter Department:");
		department=sc.nextLine();		
	}
	void printDepartment() {
		System.out.println("Depratment: "+Department);
	}
}
