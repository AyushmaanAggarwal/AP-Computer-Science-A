package MathLabs;

//import Scanner
import java.util.Scanner;

public class TrapArea {
	public static void main(String[] args) {
		//Create keyboard scanner object
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to type in base and height
		System.out.println("Type in the 2 bases and the height of a trapazoid: ");
		
		//Create bases and height variables for the trapezoid
		double base1 = kb.nextDouble();
		double base2 = kb.nextDouble();
		double height = kb.nextDouble();
		
		//Repeat the bases and height variable values to user
		System.out.println("The base lengths are: "+base1+" and "+base2+" and the height is: "+height);
		
		//Calculate the trapezoid area
		double trapArea = (base1+base2)/2*height;
		
		//Print the trapezoid area
		System.out.println("The area of that trapazoid is: "+trapArea);
	}
}
