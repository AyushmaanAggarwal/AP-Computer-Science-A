import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		char response;
		do{
			System.out.print("Guessing Game - how many numbers? ");
			GuessingGame gg = new GuessingGame(kb.nextInt());
			do{
				gg.playGame();
				System.out.print(gg.toString());
			}while(!gg.isCorrect());
			System.out.print("\nDo you want to play again? ");
			response = kb.next().charAt(0);
		} while(response=='y'||response=='Y');
	}
}
