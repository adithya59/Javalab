import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedListDemo{
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
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
					System.out.println("Enter an element:");
					int element = sc.nextInt();
					list.addFirst(element);
					break;
				}
				case 2: {
					System.out.println("Enter an element:");
					int element = sc.nextInt();
					System.out.println("Enter a Position:");
					int position = sc.nextInt();
					list.add(position, element);
					break;
				}
				case 3: {
					System.out.println("Enter an element:");
					int element = sc.nextInt();
					list.addLast(element);
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
					list.removeFirst();
					break;
				}
				case 2: {
					list.removeLast();
					break;
				}
				case 3: {
					list.remove();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
				}
			}
			case 3: {
				for(Integer element: list) {
					 System.out.println(element+" ");
				 }
				 System.out.println();
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
