package CYCLE1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="", str;
		System.out.print("Enter the string: ");
		str = sc.nextLine();
		for (int i= str.length()-1; i>=0; i--) {
			s += str.charAt(i);
		}
		if (str.equalsIgnoreCase(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}