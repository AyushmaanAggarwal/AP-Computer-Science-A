public class BlackJackCard extends Card
{
  	//constructors
    private String suit;
	private int face;
  
        //constructors
    public BlackJackCard(int face, String suit){
       super(face, suit);
    }
    public BlackJackCard(){
        super(0,"");
    }


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
        if(getFace()==1){
            return 11;
        }
        if(getFace()>=11){
            return 10;
        }

		return getFace();
  	}
  	
}