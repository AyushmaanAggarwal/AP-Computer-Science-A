import java.util.*;
public class Player
{
   private ArrayList<BlackJackCard> hand;
   private int winCount;

   public Player ()
   {
        hand = new ArrayList<BlackJackCard>();
        winCount = 0;
   }

   public Player (int score)
   {
       winCount = score;
       hand = new ArrayList<BlackJackCard>();
   }

   public void addCardToHand( Card temp )
   {
       hand.add(new BlackJackCard(temp.getFace(), temp.getSuit()));
   }

   public void resetHand( )
   {
       hand.clear();
   }

   public  void setWinCount( int numwins )
   {
       winCount = numwins;
   }

   public int getWinCount() { 
       return winCount; 
    }

   public int getHandSize() { 
        return hand.size();
    }

   public int getHandValue()
   {
       int sum = 0;
       for(Card c:hand){
            sum+=c.getValue();
       }
      return sum;
   }

   public  boolean  hit( )
   {
      return getHandValue()<21;
   }

   public String toString()
   {
        String output = "hand = [";
        int val = 0;
        for(Card c:hand){
            output+=c.toString()+", ";
            val+= c.getValue();
        }
        output+="\b\b]\n"+val;
        return output;
   }
}