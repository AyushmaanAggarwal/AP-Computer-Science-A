import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<Card>();
		topCardIndex = NUMCARDS-1;
		//loop through suits
			//loop through faces
				//add in a new card
        for(String s:SUITS){
            for(int i = 1;i<=NUMFACES;i++){
                stackOfCards.add(new Card(i,s));
            }
        }
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
        ArrayList<Card> temp = new ArrayList<Card>();
        while(stackOfCards.size()>0){
            temp.add(stackOfCards.remove((int)(Math.random()*stackOfCards.size())));
        }
        stackOfCards = temp;
        if(topCardIndex < 0){
            topCardIndex = NUMCARDS-1;
        }
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
        
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}