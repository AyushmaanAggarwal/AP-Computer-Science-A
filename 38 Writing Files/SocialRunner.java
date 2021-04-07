import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("social.dat"));
		file.nextLine();
		while(file.hasNext())
		{
            Social tl = new Social(file.nextLine());
            System.out.println(tl.toString());
		}
	}
}