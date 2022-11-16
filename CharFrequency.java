package CYCLE1;
import java.util.Scanner;
public class CharFrequency {

	public static void main(String[] args) {
		int i, ct=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.print("Enter the character to count: ");
		char ch = sc.nextLine().charAt(0);
		for(i=0; i < str.length(); i++) {
			if(ch== str.charAt(i))
				ct++;
		}
		System.out.println("Frequency of "+ch+ " = "+ct);
	}
}
