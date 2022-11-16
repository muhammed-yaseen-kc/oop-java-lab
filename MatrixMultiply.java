package CYCLE1;
import java.util.Scanner;
public class MatrixMultiply {

	public static void main(String[] args) {
		int i, j, k, r1, r2, c1, c2;
		int a[][]=new int[50][50], b[][]=new int[50][50], c[][]=new int[50][50];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no.of rows & columns of matrix 1: ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.print("Enter the no.of rows & columns of matrix 2: ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		if (c1==r2) {
			System.out.println("Multiplication Possible \nEnter matrix 1: ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c1; j++) {
					a[i][j] = sc.nextInt();
				} 
			}
			System.out.println("Enter matrix 2: ");
			for(i=0; i<r2; i++) {
				for(j=0; j<c2; j++) {
					b[i][j] = sc.nextInt();
				} 
			}
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					c[i][j]=0;
					for(k=0; k<c1; k++) {
						c[i][j] += a[i][k]*b[k][j];
					}
				} 
			}
			System.out.println("Product = ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					System.out.print(c[i][j] +"  ");
				}System.out.println(); 
			}
		}
		else 
			System.out.println("Multiplication Not Possible");
	}
}
