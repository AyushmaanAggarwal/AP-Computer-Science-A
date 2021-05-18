import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
    private Player player;
    private Dealer dealer;

	public BlackJack()
	{
        player = new Player();
        dealer = new Dealer();
	}

	public void playGame()
	{
        Character choice = 0;
        do{
            player.resetHand();
            dealer.resetHand();
            dealer.shuffle();
            player.addCardToHand(dealer.deal());
            player.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());
            
            Scanner keyboard = new Scanner(System.in);
            
            
            System.out.println("\n\nCurrent hand "+player.toString());
            
            System.out.print("Do you want to hit? [Y/N] ");
            choice = keyboard.next().charAt(0);
            while((choice.equals('y') || choice.equals('Y'))&& player.hit()){
                player.addCardToHand(dealer.deal());
                System.out.println("\nCurrent hand "+player.toString());
                System.out.println("Do you want to hit? [Y/N] ");
                choice = keyboard.next().charAt(0);
            }            
            while(dealer.hit()){
                dealer.addCardToHand(dealer.deal());
            }
            System.out.println("\n\nPLAYER\nHand Value ::"+player.getHandValue()+"\nHand Size :: "+player.getHandSize()+"\nCard in Hand :: "+player.toString());
            System.out.println("\n\nDEALER\nHand Value ::"+dealer.getHandValue()+"\nHand Size :: "+dealer.getHandSize()+"\nCard in Hand :: "+dealer.toString());
            System.out.println("");
            
            if(player.getHandValue()>21 && dealer.getHandValue()>21){
                System.out.println("Dealer wins - Dealer and Player busted!");
            } else if(player.getHandValue()>21){
                System.out.println("Dealer wins - Player busted!");
                dealer.setWinCount(dealer.getWinCount()+1);
            } else if(dealer.getHandValue()>21){
                System.out.println("Player wins - Dealer busted!");
                player.setWinCount(player.getWinCount()+1);
            } else if(player.getHandValue()>dealer.getHandValue()){
                System.out.println("Player has bigger hand value!");
                player.setWinCount(player.getWinCount()+1);
            }else if(player.getHandValue()<dealer.getHandValue()){
                System.out.println("Dealer has bigger hand value!");
                dealer.setWinCount(dealer.getWinCount()+1);
            } else {
                System.out.println("Tie Game!");
            }
            System.out.println("\nDealer has won "+dealer.getWinCount()+" times.\nPlayer has won "+player.getWinCount()+" times.\n");
            System.out.println("Do you want to play again? [Y, y, N, n] :: ");
            choice = keyboard.next().charAt(0);
        } while(choice.equals('y') || choice.equals('Y'));
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}