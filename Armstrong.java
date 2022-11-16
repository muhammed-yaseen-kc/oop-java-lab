package CYCLE1;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int n, temp, x, s=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		temp=n;
		while(n!=0) {
			x = n%10;
			s+=x*x*x;
			n/=10;
		}
		if (s==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}