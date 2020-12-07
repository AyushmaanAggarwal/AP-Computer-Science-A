public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar=c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		return theChar>=65 && theChar<=96;
	}

	public boolean isLower( )
	{
		return theChar>=97 && theChar<=122;
	}
	
	public boolean isNumber( )
	{
		return theChar<=57 && theChar>=47;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}
	
	public String toString() {
		
		if(isNumber()) {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
		
		}else if(isLower()) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		
		} else if(isUpper()){
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";	  
		
		} else {
			return "Not a valid character";
		}
	}
}