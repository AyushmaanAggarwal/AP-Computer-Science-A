import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
        if (word.length()>0){
            int locOfChicken = word.indexOf("chicken");
            if (locOfChicken != -1){
                String newWord = word.substring(0,locOfChicken)+word.substring(locOfChicken+7);
                return 1+countChickens(newWord);
            }
        }
        

		return 0;
	}
}