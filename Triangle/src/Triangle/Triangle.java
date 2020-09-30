package Triangle;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		//Create a keyboard for inputs
		Scanner kb = new Scanner(System.in);
		//Ask for any 3 sides of a triangle
		System.out.println("Type in 3 sides of a trianlge");
		int triangleSide1 = kb.nextInt();
		int triangleSide2 = kb.nextInt();
		int triangleSide3 = kb.nextInt();
		//Check how the sides of a triangle relate to each other to determine the type of a triangle
		if(triangleSide1==triangleSide2 && triangleSide2==triangleSide3) {
			//If true the triangle is a right triangle
			System.out.println("Your triangle is a Regular Traingle");
		} else if(triangleSide1==triangleSide2 || triangleSide2==triangleSide3) {
			System.out.println("Your trianlge is a Isosceles Triangle");
		} else if(RightTriangleCheck(triangleSide1, triangleSide2, triangleSide3)){
			System.out.println("Your trianlge is a Right Triangle");
		} else {
			System.out.println("Your Triangle is a Scalene Triangle");
		}
		System.out.println("");
	}
	public static boolean RightTriangleCheck(int side1, int side2, int side3) {
		if(side1>side2 && side1>side3) {
			return side1*side1 == side2*side2 + side3*side3;
		} else if (side2>side1 && side2>side3) {
			return side2*side2 == side1*side1 + side3*side3;
		} else {
			return side3*side3 == side1*side1 + side2*side2;
		}
	}
}
