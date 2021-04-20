import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;


public class FancyWordTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
        Scanner file = new Scanner(new File ("fancyword2.dat"));
		int size = file.nextInt();
		file.nextLine();
        FancyWordTwo fs;
		
        for(int i = 0; i<size; i++)
		{
			String word = file.next();
            fs = new FancyWordTwo(word);
            System.out.println(fs.toString());
	   }
	}
}