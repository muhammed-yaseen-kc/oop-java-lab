package CYCLE1;

public class Commandline {

	public static void main(String[] args) {
		System.out.println("Commandline Arguments: ");
		for(int i=0; i< args.length; i++) {
			System.out.println((i+1) + ") Java is "+ args[i]);
		}
	}
}
