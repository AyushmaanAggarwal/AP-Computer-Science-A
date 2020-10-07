package mathCircle;

import java.util.Scanner;
import java.lang.Math;
public class MathCircle {
	public static void main(String[] args) {
		// Create a new keyboard methods
		Scanner kb = new Scanner(System.in);
		
		// Prompt user to enter the radius of a circle
		System.out.println("Enter the radius of a circle here: ");
		
		//Create a new variable for the radius
		double radius = kb.nextDouble();
		
		// Calculate the area of the circle
		double area = Math.PI*Math.pow(radius, 2);
		
		//Print the area for the user
		System.out.println("The area of a circle with radius "+radius+" is "+area);
	}
}
