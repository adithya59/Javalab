/*************************************************************************************************
 * Name					:FrequencyofChar.java
 * Description			:A java program that checks the frequency of a character in a string.
 * Author				:Adithya P Binu
 * Version				:1.0
 * Date					:29/09/2023
 ************************************************************************************************/
import java.util.Scanner;
public class FrequencyofChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		System.out.println("Enter a character to check for:");
		char check = sc.next().charAt(0);
		System.out.println("The Number of occurance of " + check + " in the string is: " + Freq(input, check));
	}
	static int Freq (String input, char check) {
		int count = 0;
		int length = input.length();
		char [] charArray = input.toCharArray();
		for (int i=0;i<length;i++) {
			if (charArray[i]==check) {
				count++;
			}
		}
		return count;
	}
}
