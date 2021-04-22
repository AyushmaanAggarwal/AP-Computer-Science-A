import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare1
{
	private int[][] mat;

	//size the matrix and load in the numbers into the matrix
	//write all nested loop code here in the constructor
	public MagicSquare1(int size, String numbers)
	{
        mat = new int[size][size];
        String[] num = numbers.split(" ");
        int r = 0;
        int c = 0;
        for(String n:num){
            mat[r][c] = Integer.parseInt(n);
            c++;
            if(c>=size){
                c=0;
                r++;
            }
            if(r>=size)
                break;
        }
	}

	public boolean isMagicSquare()
	{
        int compare = sumRow(0);
        for(int i = 0; i<mat.length;i++){
            if(sumRow(i)!=compare)
                return false;
            if(sumCol(i)!=compare)
                return false;
        }
		return false;
	}

	public int sumRow( int r )
	{
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            sum+= mat[r][i];
        }
		return sum;
	}

	public int sumCol( int c )
	{
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            sum+= mat[i][c];
        }
		return sum;
	}

	public int sumDownDiag()
	{
        //bottom left
		int sum = 0;
        for(int i = 0; i<mat.length; i++){
            sum+= mat[mat.length-1-i][i];
        }
		return sum;
	}

	public int sumUpDiag()
	{
        //top left
		int sum = 0;
        for(int i = 0; i<mat.length; i++){
            sum+= mat[i][i];
        }
		return sum;
	}

	public String toString()
	{
		String output="";
        for(int[] n1:mat){
            for(int n2:n1){
                output += n2+" ";
            }
            output+="\n";
        }
        output += "\b"+((isMagicSquare())?"MAGIC SQUARE":"NOT A MAGIC SQUARE");
		return output;
	}
}