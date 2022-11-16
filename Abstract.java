package CYCLE1;
abstract class Shape{
	abstract void numOfSides();
}
class Rectangle extends Shape{
	void numOfSides() {
		System.out.println("No. of sides of rectangle = 4 ");
	}
}
class Triangle extends Shape{
	void numOfSides() {
		System.out.println("No. of sides of triangle = 3 ");
	}
}
class Hexagon extends Shape{
	void numOfSides() {
		System.out.println("No. of sides of hexagon = 6 ");
	}
}
public class Abstract {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numOfSides();
		t.numOfSides();
		h.numOfSides();
	}
}
