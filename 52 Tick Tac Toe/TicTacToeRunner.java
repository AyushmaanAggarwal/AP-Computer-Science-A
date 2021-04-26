import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner
{
	public static void main( String args[] ) throws IOException
	{
        Scanner kb = new Scanner(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\52 Tick Tac Toe\\tictactoe.dat"));
		int count = kb.nextInt();
		kb.nextLine();
		for(int i= 0; i<count;i++){
			TicTacToe ttt = new TicTacToe(kb.nextLine());
			System.out.print(ttt.toString());
		}
	}
}