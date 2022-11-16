package CYCLE1;
import java.util.Scanner;
public class Fibonacci {
	static int fibo(int n) {
		if (n==0 || n==1)
			return n;
		else
			return (fibo(n-1)+fibo(n-2));
	}
	public static void main(String[] args) {
		int i, n, m=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of terms: ");
		n = sc.nextInt();
		System.out.print("Fibonacci series: ");
		for(i=1; i<=n; i++) {
			System.out.print(fibo(m)+ "  ");
			m++;
		}
	}
}
