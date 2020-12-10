import java.util.Scanner;

public class StringStuffRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string:");
		StringStuff stringMethod = new StringStuff(kb.next());
		
		System.out.println("First and Last Letters are: "+stringMethod.getFirstLastLetter());
		System.out.println("Middle Letter is          : "+stringMethod.getMiddleLetter());
		System.out.println("First and Last Letters are the same: "+stringMethod.sameFirstLastTest());
	}
}
