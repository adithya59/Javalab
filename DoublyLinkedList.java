package javalab;
import java.util.Scanner;
public class DoublyLinkedList {
	public static void main(String[] args) {
		Node node = new Node();
		Scanner sc = new Scanner(System.in);
		boolean key = true;
		System.out.println("****Doubly Linked List****");
		while(key) {
			System.out.println("1.Insert an element");
			System.out.println("2.Delete an element");
			System.out.println("3.Display list");
			System.out.println("4.Exit");
			System.out.println("Enter a choice");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("1.Insert at Beginning");
				System.out.println("2.Insert at Position");
				System.out.println("3.Insert at End");
				System.out.println("Enter a choice");
				switch (sc.nextInt()) {
				case 1: {
					node.InsertAtBeginning();
					break;
				}
				case 2: {
					node.InsertAtAnyPosition();
					break;
				}
				case 3: {
					node.InsertAtEnd();
					break;
				}
				default:{
					throw new IllegalArgumentException("Unexpected value: " + key);
					}
				}
				break;
			}
			case 2: {
				System.out.println("1.Delete from Beginning");
				System.out.println("2.Delete from a Position");
				System.out.println("3.Delete from End");
				System.out.println("Enter a choice");
				switch (sc.nextInt()) {
				case 1: {
					node.DeleteFromBeginning();
					break;
				}
				case 2: {
					node.DeleteFromPosition();
					break;
				}
				case 3: {
					node.DeleteFromEnd();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
				}
			}
			case 3: {
				node.Display();
				break;
			}
			case 4: {
				key=false;
				break;
			}
			default: {
				throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
				}
			}
		}
	}
}

class Node {
	Node prev,next,ptr;
	int data;
	Node head,tail = null;
	Scanner sc = new Scanner(System.in);
	public void InsertAtBeginning(){
		Node newnode = new Node();
		System.out.println("Enter data:");
		newnode.data=sc.nextInt();
		if (head==null) {
			head = tail = newnode;
		}
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void InsertAtAnyPosition(){
		ptr=head;
		Node newnode = new Node();
		System.out.println("Enter data:");
		newnode.data=sc.nextInt();
		System.out.println("Enter Position:");
		int pos = sc.nextInt();
		if (head==null) {
			head = tail = newnode;
		}
		else {
			ptr=head;
			for(int i=2;i<pos;i++) {
				ptr=ptr.next;
			}
			ptr.next.prev=newnode;
			newnode.next=ptr.next;
			newnode.prev=ptr;
			ptr.next=newnode;
		}
	}
	
	public void InsertAtEnd(){
		ptr=head;
		Node newnode = new Node();
		System.out.println("Enter data:");
		newnode.data=sc.nextInt();
		if (head==null) {
			head = tail = newnode;
		}
		else {
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=newnode;
			newnode.prev=ptr;
			newnode=tail;
		}
	}
	
	public void DeleteFromBeginning(){
		if (head==null) {
			System.out.println("Empty List");
		}
		else {
			head=head.next;
			head.prev=null;
		}
	}
	
	public void DeleteFromEnd(){
		if (head==null) {
			System.out.println("Empty List");
		}
		else {
			ptr=head;
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.prev.next=null;
		}
	}
	
	public void DeleteFromPosition(){
		System.out.println("Enter a Position:");
		int pos = sc.nextInt();
		if (head==null) {
			System.out.println("Empty List");
		}
		else {
			ptr=head;
			for(int i=2;i<pos;i++) {
				ptr=ptr.next;
			}
			ptr.next.next.prev=ptr;
			ptr.next=ptr.next.next;
		}
	}
	
	public void Display() {
		ptr=head;
		while (ptr!=null) {
			System.out.print(ptr.data+"\t");
			ptr=ptr.next;
		}
		System.out.println();
	}
}