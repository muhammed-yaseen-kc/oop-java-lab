package CYCLE1;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		int n, i, j, a[]=new int[50], temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n= sc.nextInt();
		System.out.print("Enter array elements: ");
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(i=0; i<n; i++) {
			for (j=0; j<n-i-1; j++) {
				if (a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Second Smallest Element = " + a[1]);
	}
}
