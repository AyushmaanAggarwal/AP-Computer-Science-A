import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
  private String winner;
  private String output;

  public RockPaperScissors(String player)
	{
    playChoice = player.toUpperCase();
    switch ((int)(Math.random()*3)){
    	case 0:compChoice="R";
    	case 1:compChoice="P";
    	case 2:compChoice="S";
		}
	}

	public String determineWinner()
	{
    switch (playChoice) {
      case "R":
        switch (compChoice) {
          case "R": return "!Draw Game!";
          case "P": return "!Computer wins <<Paper Covers Rock>>!";
          case "S": return "!Player wins <<Rock Breaks Scissors>>!";
				}
			case "P":
        switch (compChoice){
          case "P": return "!Draw Game!";
          case "R": return "!Player wins <<Paper Covers Rock>>!";
          case "S": return "!Computer wins <<Scissors Cuts Paper>>!";
				}
			case "S":
        switch (compChoice){
          case "S": return "!Draw Game!";
          case "R": return "!Computer wins <<Rock Breaks Scissor>>!";
          case "P": return "!Player wins <<Scissors Cuts Paper>>!";
				}
		}
		return "Not A Valid Weapon! Pick Rock, Paper or Scissors";
	}

	public String toString()
	{
		String output="player had "+playChoice+"\ncomputer had "+compChoice;
		return output;
	}
}
