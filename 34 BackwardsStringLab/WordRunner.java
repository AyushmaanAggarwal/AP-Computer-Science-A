public class WordRunner
{
	public static void main ( String[] args )
	{
        Word w1 = new Word("Hello"); 
        System.out.printf("%c\n%c\n%s\n%s\n\n\n",w1.getFirstChar(),w1.getLastChar(),w1.getBackWards(),w1.toString());
        Word w2 = new Word("World"); 
        System.out.printf("%c\n%c\n%s\n%s\n\n\n",w2.getFirstChar(),w2.getLastChar(),w2.getBackWards(),w2.toString());
        Word w3 = new Word("JukeBox"); 
        System.out.printf("%c\n%c\n%s\n%s\n\n\n",w3.getFirstChar(),w3.getLastChar(),w3.getBackWards(),w3.toString());
        Word w4 = new Word("TCEA"); 
        System.out.printf("%c\n%c\n%s\n%s\n\n\n",w4.getFirstChar(),w4.getLastChar(),w4.getBackWards(),w4.toString());
        Word w5 = new Word("UIL"); 
        System.out.printf("%c\n%c\n%s\n%s\n\n\n",w5.getFirstChar(),w5.getLastChar(),w5.getBackWards(),w5.toString());
	}
}