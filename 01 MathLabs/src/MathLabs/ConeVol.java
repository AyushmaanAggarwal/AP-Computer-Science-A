package MathLabs;

//import Scanner
import java.util.Scanner;

public class ConeVol {
	public static void main(String[] args) {
		//Create keyboard scanner object
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to type in length and width
		System.out.println("Type in the radius and height of a cone: ");
		double radius = kb.nextDouble();
		double height = kb.nextDouble();
		
		//Repeat the radius and height of the cone to user
		System.out.println("The radius is: "+radius+" and height is: "+height);
		
		//Calculate the volume of the cone
		double pi = 3.14159;
		double volume = pi*radius*radius*height/3;
		
		//Print the volume of the cone to user
		System.out.println("The volume of the cone is: "+volume);
	}
}
