package javalab;
import java.util.Scanner;
public class Quicksort {
	public static void main(String[] args) {
		Quicksort sorter = new Quicksort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		sc.nextLine();
		String array[] = new String[size];
		System.out.println("Enter the elements: ");
		for (int i=0;i<size;i++) {
			array[i] = sc.nextLine();
		}
		sorter.sort(array,0,size-1);
		System.out.print("Sorted Array: ");
		for(String elements : array) {
			System.out.print(elements+" ");
		}
	}
	void sort(String[] array, int left, int right) {
		if (left<right) {
			int key = partition(array,left,right);
			sort(array,left,key-1);
			sort(array,key+1,right);
		}
	}
	int partition(String[] array, int left, int right) {
		String pivot=array[left];
		int i = left, j = right;
		while(j>i) {
			while (array[i].compareTo(pivot) <= 0 && i<right) {
				i++;
			}
			while (array[j].compareTo(pivot) <= 0 && j>left) {
				j--;
			}
			if (j>i) {
				String temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		String temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		return j;
	}
}
