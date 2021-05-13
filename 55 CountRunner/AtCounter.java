import static java.lang.System.*;
import java.lang.Math;

public class AtCounter
{
   private String[][] atMat;

	public AtCounter()
	{
        atMat = new String[10][10];

		//size the matrix
		//use nested loops to randomly load the matrix
		for(int i = 0; i<atMat.length; i++){
            for(int j = 0; j<atMat.length; j++){
                if(Math.random()<.5){
                    atMat[i][j] = "@";
                } else {
                    atMat[i][j] = "-";
                }
            }
        }
        //you will need to use Math.random()
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		return 0;
	}

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		return "";
	}
}