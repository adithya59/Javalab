/*************************************************************************************************
 * Name					:Palindrome.java
 * Description			:A java program that checks whether a string is palindrome.
 * Author				:Adithya P Binu
 * Version				:1.0
 * Date					:29/09/2023
 ************************************************************************************************/
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string:");
		String input = sc.next();
		boolean isPalindrome = Check (input);
		if (isPalindrome) {
			System.out.println("The given string is Palindrome");
		}
		else {
			System.out.println("The given string is not Palindrome");
		}
	}
	static boolean Check (String input) {
		char [] charArray = input.toCharArray();
		int length = input.length();
		for(int i=0;i<length/2;i++) {
			if (charArray[i]!=charArray[length-1-i]) {
				return false;
			}
		}
		return true;
	}
}
