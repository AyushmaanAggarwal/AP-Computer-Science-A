import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class TheLineRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
            TheLine tl = new TheLine(file.nextLine());
            System.out.println(tl.toString());
		}
	}
}