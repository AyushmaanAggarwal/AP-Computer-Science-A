public class Dealer extends Player
{
	//define a deck of cards
    Deck currentDeck;

	public Dealer() {
        currentDeck=new Deck();
	}

	public void  shuffle()
	{
	   currentDeck.shuffle();
	}

	public Card  deal(){
	   return currentDeck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return currentDeck.numCardsLeft();
	}

	public boolean hit()
	{
	   return currentDeck.hit();
    }
}