package CYCLE1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i, f=1, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			f*=i;
		}
		System.out.println("Factorial = "+ f);
	}
}