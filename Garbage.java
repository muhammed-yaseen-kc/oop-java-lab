package CYCLE1;

public class Garbage {
	public void finalize() {
		System.out.println("Garbage Collected");
	}
	public static void main(String[] args) {
		Garbage o1 = new Garbage();
		Garbage o2 = new Garbage();
		o1 = null;
		o2 = null;
		System.gc();
	}

}
