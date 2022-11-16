package CYCLE1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int i,s=0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		for(i=1; i<=n/2; i++) {
			if (n%i==0)
				s++;
		}
		if (s==1)
		    System.out.println("Prime Number");
		else
		    System.out.println("Not Prime Number");
	}
}