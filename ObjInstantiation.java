package CYCLE1;
class Employee {
	void display() {
		System.out.println("Class name is Employee ");
	}
	void calcSalary() {
		System.out.println("Salary of Employee is 20,000 ");
	}
}
class Engineer extends Employee {
	Engineer(){
	super.display();
	super.calcSalary();
}}
public class ObjInstantiation {
	public static void main(String[] args) {
		Engineer e = new Engineer();
	}
}
