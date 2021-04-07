import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Computer Science");
	   out.println(test);
	   test.makeUpper();
	   out.println(test);
	   test.addHyphen();
	   out.println(test);

	   //add more test cases

	}
}