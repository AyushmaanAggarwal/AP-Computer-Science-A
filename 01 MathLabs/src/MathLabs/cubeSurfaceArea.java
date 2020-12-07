package MathLabs;

//import Scanner
import java.util.Scanner;

public class cubeSurfaceArea {
	public static void main(String[] args) {
		//Create keyboard scanner object
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to type in length and width
		System.out.println("Type in a side of a cube: ");
		
		//Create the side variable
		double side = kb.nextDouble();
		
		//Repeat the side length to user
		System.out.println("The side is: "+ side);
		
		//Calculate surface area of the cube
		double surfaceArea = 6*side*side;
		
		//Print the surface area to console
		System.out.println("The surface area of this cube is "+surfaceArea);
	}
}
