import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A
		CharacterAnalyzer test1 = new CharacterAnalyzer('1');
		out.println(test1);   //A
		CharacterAnalyzer test2 = new CharacterAnalyzer('a');
		out.println(test2);   //A
		CharacterAnalyzer test3 = new CharacterAnalyzer('7');
		out.println(test3);   //A
		CharacterAnalyzer test4 = new CharacterAnalyzer('D');
		out.println(test4);   //A
		CharacterAnalyzer test5 = new CharacterAnalyzer('2');
		out.println(test5);   //A
		CharacterAnalyzer test6 = new CharacterAnalyzer('X');
		out.println(test6);   //A
		CharacterAnalyzer test7 = new CharacterAnalyzer('z');
		out.println(test7);   //A
		CharacterAnalyzer test8 = new CharacterAnalyzer('9');
		out.println(test8);   //A
		//add more test cases	

	}
}