import static java.lang.System.*;
import java.lang.Math;

public class AtCounter
{
   private String[][] atMat;
	private boolean[][] filled;
	private int counter;
	public AtCounter()
	{
        atMat = new String[10][10];
		filled = new boolean[10][10];
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
		if (counter==0){
			filled = new boolean[10][10];
		}
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(atMat[r][c].equals("@")&&!filled[r][c]){
			filled[r][c]=true;
			counter++;
			int num = 1;
			if (r+1<atMat.length){
				num+=countAts(r+1,c);
			}
			if (r-1>=0){
				num+=countAts(r-1,c);
			}
			if (c+1<atMat.length){
				num+=countAts(r,c+1);
			}
			if (c-1>=0){
				num+=countAts(r,c-1);
			}
			counter--;
			return num;
		}
		return 0;
	}

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		String output = "";
		for(String[] at:atMat){
			for(String a:at){
				output += a+ " ";
			}
			output += "\n";
		}
		return output+"\b";
	}
}