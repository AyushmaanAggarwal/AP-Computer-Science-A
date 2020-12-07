package FahrenheitRunner;

// import Scanner
import java.util.Scanner;

public class FahrenheitRunner
{
	public static void main( String[] args )
	{
		// Create a new scanner method
		Scanner kb = new Scanner( System.in );
		
		//Prompt user to enter in fahrenheit value
		System.out.print( "Enter the fahrenheit value :: " );
		double f = kb.nextDouble();
		
		//Calculate Celsius value
		double c = (f-32)*5/9;
		//Print the celsius value
		System.out.println("The celsius value of "+f+"*F is: "+c+"*C");
		
	}
}