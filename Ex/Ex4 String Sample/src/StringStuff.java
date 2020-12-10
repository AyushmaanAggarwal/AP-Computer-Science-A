
public class StringStuff {
	
	private String Stuff;
	
	public StringStuff() {
	}
	public StringStuff(String stuff) {
		Stuff = stuff;
	}
	public String getFirstLastLetter() {
		return Stuff.charAt(0)+" "+Stuff.charAt(Stuff.length()-1);
	}
	public char getMiddleLetter() {
		return Stuff.charAt(Stuff.length()/2);
	}
	public boolean sameFirstLastTest() {
		return Stuff.substring(0,1).equals(Stuff.substring(Stuff.length()-1));
	}
}

