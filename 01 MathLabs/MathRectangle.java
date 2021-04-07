package MathLabs;

//import Scanner
import java.util.Scanner;

public class MathRectangle {
	public static void main(String[] args) {
		//Create keyboard scanner object
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to type in length and width
		System.out.println("Enter the length and width of a rectangle: ");
		
		//Create length and width variables
		double length = kb.nextDouble();
		double width = kb.nextDouble();
		
		//Repeat the length and width variable values to user
		System.out.println("The length is: "+length+" and the width is: "+width);

		//Calculate the perimeter from the length and width
		double perimeter = 2*length + 2*width;
		
		//Print the perimeter length
		System.out.println("The perimeter for this rectangle is: "+perimeter);
	}
}
