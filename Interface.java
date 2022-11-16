package CYCLE1;
import java.util.Scanner;
interface Sports{
	final int SPORTWT =6;
	abstract void putWt();
}
class Student{
	int rollNumber;
	void getNumber(int roll) {
		rollNumber = roll;
	}
	void putNumber() {
		System.out.println("Roll Number: "+rollNumber);
	}
}
class Test extends Student {
	float part1, part2;
	void getMarks(float m1,float m2) {
		part1 = m1;
		part2 = m2;
	}
	void putMarks() {
		System.out.println("Part 1: "+part1+"\nPart 2: "+part2);
	}
}
class Result extends Test implements Sports{
	public void putWt() {
		System.out.println("SportWt: "+SPORTWT);
	}
	void display(){
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total Marks: "+(part1+part2+SPORTWT));
	}
}
public class Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Result r = new Result();
		System.out.print("Enter the roll no: ");
		r.rollNumber = sc.nextInt();
		r.getNumber(r.rollNumber);
		System.out.print("Enter the marks of term 1 & 2: ");
		r.part1 = sc.nextFloat();
		r.part2 = sc.nextFloat();
		r.getMarks(r.part1, r.part2);
		r.display();
	}
}
