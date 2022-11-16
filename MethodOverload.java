package CYCLE1;
import java.util.Scanner;
class Calculate{
	void area(float r) {
		System.out.println("Area of circle = " + (3.14*r*r));
	}
	void area(float a, float b) {
		System.out.println("Area of rectangle = " + (a*b));
	}
	void area(float a, float b, float c) {
		float s = (a+b+c)/2;
		System.out.println("Area of triangle = " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}
public class MethodOverload {

	public static void main(String[] args) {
		float r, x, y, a, b, c;
		Scanner sc = new Scanner(System.in);
		Calculate ar = new Calculate();
		System.out.println("Enter radius of circle: ");
		r = sc.nextFloat();
		ar.area(r);
		System.out.println("Enter dimensions of rectangle: ");
		x = sc.nextFloat();
		y = sc.nextFloat();
		ar.area(x, y);
		System.out.println("Enter dimensions of triangle: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		ar.area(a, b, c);
	}
}
