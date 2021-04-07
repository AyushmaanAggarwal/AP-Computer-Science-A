import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddoreven.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();
            //instantiate an OddOrEven
            OddOrEven oe = new OddOrEven(num);
            System.out.println(oe);
		}
	}
}