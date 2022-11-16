package CYCLE1;

public class CommandPalindrome {

	public static void main(String[] args) {
		int a, b, i, rem, temp, rev;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		System.out.print("Palindrome numbers between "+ a+ " & "+b +" = ");
		for(i=a; i<=b; i++) {
			temp = i; rev=0;
			while(temp != 0) {
				rem = temp%10;
				rev = rev*10 + rem;
				temp /= 10;
			}
			if(rev == i)
				System.out.print(i +"  ");
		} System.out.println();
	}
}
