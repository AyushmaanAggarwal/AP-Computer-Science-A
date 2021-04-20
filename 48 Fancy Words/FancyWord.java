import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class FancyWord
{
	private String[][] mat;

   public FancyWord(String s)
	{
		//size the matrix
        mat = new String[s.length()][s.length()];
        
		//use Arrays.fill() to fill in the matrix with spaces
        String space = " ";
		for(int i = 0; i<mat.length; i++){
			Arrays.fill(mat[i], space);
		}
		
		
		//use a for loop to load in the letters into the matrix
        for(int i = 1; i<s.length()-1; i++){
            mat[i][i] = s.substring(i,i+1);
			mat[i][s.length()-1-i] = s.substring(s.length()-1-i,s.length()-i);
        }
		mat[s.length()-1][0] = s;
		mat[0][0] = s;
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