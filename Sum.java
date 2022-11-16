package CYCLE1;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int a,b, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		sum = a+b;
		System.out.println("a + b = " + sum);
	}
}
