package CYCLE1;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="", str;
		System.out.print("Enter the string: ");
		str = sc.nextLine();
		for (int i= str.length()-1; i>=0; i--) {
			s += str.charAt(i);
		}
		System.out.println("Reversed String = "+s);
	}
}
