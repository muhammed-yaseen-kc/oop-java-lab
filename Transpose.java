package CYCLE1;
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		int a[][] = new int[50][50], i, j, r, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of rows & columns: ");
		r = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Enter the matrix: ");
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				a[i][j] = sc.nextInt();
			} 
		}
		System.out.println("Matrix = ");
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				System.out.print(a[i][j] +"  ");
			}System.out.println();
		}
		System.out.println("Transpose = ");
		for(i=0; i<c; i++) {
			for(j=0; j<r; j++) {
				System.out.print(a[j][i] +"  ");
			}System.out.println();
		}
	}
}
