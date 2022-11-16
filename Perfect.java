package CYCLE1;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		int n, temp, i, s=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		temp=n;
		for(i=1; i<=n/2; i++) {
			if (n%i==0)
				s+=i;
		}
		if (s==temp)
		    System.out.println("Perfect Number");
		else
		    System.out.println("Not Perfect Number");
	}
}