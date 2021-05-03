public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
    public Card(int face, String suit){
        this.face = face;
        this.suit = suit;
    }

	// modifiers
    public void changeSuit(String suit){
        this.suit = suit;
    }
    public void changeFace(int face){
        this.face = face;
    }
  	//accessors
    public String getSuit(){
        return suit;
    }
    public int getFace(){
        return face;
    }
  	public int getValue()
  	{
  		return face;
  	}

	public boolean equals(Object obj)
	{
		if(this.toString().equals(obj.toString())){
            return true;
        }
        return false;
	}

  	//toString
    public String toString(){
        return FACES[face]+" of "+suit+" | value = "+getValue(); 
    }
  	
 }