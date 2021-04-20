import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWordTwo
{
	private String[][] mat;

   public FancyWordTwo(String s)
	{
		//size the matrix
        mat = new String[s.length()][s.length()];
		//use Arrays.fill() to fill in the matrix with spaces
        for(int i = 0; i < s.length(); i++){
            Arrays.fill(mat[i], new String(" "));
        }
		//use a for loop to load in the letters into the matrix
        mat[0][0] = s;
        String sReverse = s.substring(s.length()-1);
        for (int i = s.length()-1;i > 0; i--){
            sReverse+=s.substring(i-1,i);
        }
        mat[s.length()-1][0]= sReverse;
        for(int i = 1;i < s.length()-1; i++){
            mat[i][0] = s.substring(i,i+1);
            mat[i][s.length()-1] = sReverse.substring(i,i+1);
        }
	}

	public String toString()
	{
		String output="";
        for(String[] mR:mat){
			for(String m:mR){
				output+= m;
			}
			output+="\n";
		}
		return output+"\n\n";
	}
}