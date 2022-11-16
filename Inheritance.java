package CYCLE1;
import java.util.Scanner;
class Employees {
	String name, address;
	int age, ph;
	float salary;
	void printSalary() {
		System.out.println(" Salary: "+ salary);
	}
}
class Officer extends Employees{
	String specialization;
}
class Manager extends Employees{
	String dept;
}
public class Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Officer o = new Officer();
		Manager m = new Manager();
		o.name = "Ananya";
		o.address = "XYZ street, Gandhinagar, Gujarat, India ";
		o.age = 25;
		o.ph = 834522564;
		o.salary = 42000;
		m.name = "Siddharth";
		m.address = "ABC Nagar, Gwalior, West Bengal, India";
		m.age = 32;
		m.ph = 923487651;
		m.salary = 50000;
		System.out.println("Officer Details \n Name: " + o.name + "\n Address: " + o.address + "\n Age: " + o.age +"\n Phone Number: " + o.ph);
		o.printSalary();
		System.out.println("\nManager Details \n Name: " + m.name + "\n Address: " + m.address + "\n Age: " + m.age +"\n Phone Number: " + m.ph);
		m.printSalary();
	}
}
