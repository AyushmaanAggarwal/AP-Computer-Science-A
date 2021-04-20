import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("fancyword.dat"));
		int size = file.nextInt();
		file.nextLine();
        FancyWord fs;
		
        for(int i = 0; i<size; i++)
		{
			String word = file.next();
            fs = new FancyWord(word);
            System.out.println(fs.toString());
	   }
       
	}
}