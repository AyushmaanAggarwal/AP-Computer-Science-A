import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
  private int guessValue;
  private int randomValue;
	private int numberOfGuesses;
	private String output;

	public GuessingGame(int stop){
    upperBound = stop;
		randomValue = (int)(Math.random()*upperBound)+1;

	}

	public void playGame() {
		Scanner kb = new Scanner(System.in);
    System.out.print("Enter a number between 1 and "+upperBound+" ");
    guessValue = kb.nextInt();
		numberOfGuesses++;
	}

	public String toString() {
		if (guessValue > upperBound || guessValue <1){
			output = "Number out of range!\n";
		} else if (guessValue==randomValue){
			output = "\nIt took "+numberOfGuesses+" guesses to guess "+randomValue+".\n\n\n";
			numberOfGuesses=0;
		} else {
			output = "";
		}

		return output;
	}
	public boolean isCorrect() {
		return guessValue==randomValue;
	}
}
