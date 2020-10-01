package Triangle;

//import the Scanner package for inputs
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		//Create a keyboard for inputs
		Scanner kb = new Scanner(System.in);

		//Ask for any 3 sides of a triangle
		System.out.println("Type in 3 sides of a trianlge: ");
		int triangleSide1 = kb.nextInt();
		int triangleSide2 = kb.nextInt();
		int triangleSide3 = kb.nextInt();
		
		//Check how the sides of a triangle relate to each other to determine the type of a triangle
		if(!TriangleCheck(triangleSide1, triangleSide2, triangleSide3)) {
			
			//If one side is greater than the sum of the other 2, the triangle cannot exist
			System.out.println("Your triangle doesn\'t exist!");
		
		} else if(triangleSide1==triangleSide2 && triangleSide2==triangleSide3) {
			
			//If all sides are equal, the triangle is a regular triangle
			System.out.print("Your triangle is a Regular Triangle");
		
		} else if(triangleSide1==triangleSide2 || triangleSide2==triangleSide3 || triangleSide1==triangleSide3) {
			
			//If 2 sides are equal, the triangle is a isosceles triangle
			System.out.print("Your trianlge is a Isosceles Triangle");
		
		} else {
			
			//If no sides are equal, the triangle is a scalene triangle
			System.out.print("Your Triangle is a Scalene Triangle");
		}
		
		if(RightTriangleCheck(triangleSide1, triangleSide2, triangleSide3)){
			
			//If the pythagorean theorem if true, the triangle is a right triangle
			System.out.println(" and a Right Triangle");
		}
	}
	
	public static boolean RightTriangleCheck(int side1, int side2, int side3) {
		//This finds what side is the longest and then returns if the pythagorean theorem is true(a^2 + b^2 = c^2)
		//This theorem would prove that the triangle is a right triangle
		if(side1>side2 && side1>side3) {
			return side1*side1 == side2*side2 + side3*side3;
		
		} else if (side2>side1 && side2>side3) {
			return side2*side2 == side1*side1 + side3*side3;
		
		} else {
			return side3*side3 == side1*side1 + side2*side2;
		}
	}
	
	public static boolean TriangleCheck(int side1, int side2, int side3) {
		//This if statement checks if any side is equal to 0
		if(side1==0||side2==0||side3==0) {
			return false;
		}
		//These if statements finds what side is the longest 
		//and then checks if the longest side is shorter than sum of the shorter sides (c < a + b)
		//This check would prove that the triangle can exist
		if(side1>side2 && side1>side3) {
			return side1 < side2 + side3;
	
		} else if (side2>side1 && side2>side3) {
			return side2 < side1 + side3;
		
		} else {
			return side3 < side1 + side2;
		}
	}
}
