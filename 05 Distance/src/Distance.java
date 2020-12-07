import java.lang.Math;

public class Distance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		//calculate the distance from the sqrt((x2-x1)^2+(y2-y1)^2)
		double distance = Math.sqrt(Math.pow((double)(xTwo-xOne),2) + Math.pow((double)(yTwo-yOne),2));
		
		//Return the distance value
		return distance;	
	}
}