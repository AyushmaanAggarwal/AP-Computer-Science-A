import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		char response;
    String player = "";

    //add in a do while loop after you get the basics up and running
    do {
  		out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
      RockPaperScissors rps = new RockPaperScissors(kb.next());
      out.println("\n"+rps.toString());
      out.println(rps.determineWinner());
			out.println("Do you want to play again? [Y,N]");
			response = kb.next().toUpperCase().charAt(0);
    }while(response=='Y');


	}
}
