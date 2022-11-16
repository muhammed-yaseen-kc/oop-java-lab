package CYCLE1;

public class Exception {
	static void fun() {
		try {
			throw new NullPointerException("demo ");
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside fun");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside main");
		}
		try {
			int a=0, b=43/a;
		}
		catch(ArithmeticException ar) {
			System.out.println("Exception: "+ar);
		}
		finally {
			System.out.println("Caught inside finally");
		}
	}

}
