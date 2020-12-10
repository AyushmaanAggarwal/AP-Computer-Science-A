import java.util.Scanner;
import java.lang.Math;
public class IfElse {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a random number 1-10 and see if you guessed");
		int randomNumber = (int)(Math.random()*10);
		boolean condition = kb.nextInt()==randomNumber;
		if (condition) {
			System.out.println("It worked");
		} else {
			System.out.println("The correct number was: " + randomNumber);

			System.out.println("Try again");
		}
	}
}
