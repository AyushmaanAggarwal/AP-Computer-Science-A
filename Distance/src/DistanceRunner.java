import java.util.Scanner;
import static java.lang.System.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//Create a scanner method
		Scanner keyboard = new Scanner( System.in );

		//Type in several parameters
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		//Create a new distance method to print distance between points
		Distance test = new Distance();
		System.out.println( test.getDistance( x1, y1, x2, y2 ) );			
	}
}
