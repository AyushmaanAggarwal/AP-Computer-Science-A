import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		perimeter = sideA + sideB + sideC;
		double s = perimeter/2;
	}

	public double getArea( )
	{
		double s = perimeter/2;

		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
}