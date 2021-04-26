import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
        mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                mat[i][j] = game.charAt(3*i+j);
            }
        }
	}

	public String getWinner()
	{
        for(int i = 0; i<3; i++){
			if (mat[i][0]==mat[i][1]&&mat[i][0]==mat[i][2])
            	return Character.toString(mat[0][0])+" wins horizontally!";
		}
        for(int i = 0; i<3; i++){
			if(mat[0][i]==mat[1][i]&&mat[0][i]==mat[2][i])
				return Character.toString(mat[0][0])+" wins vertically!";
		}
		if(mat[0][0]==mat[1][1]&&mat[0][0]==mat[2][2])
			return Character.toString(mat[0][0])+" wins diagonally!";
        if(mat[2][0]==mat[1][1]&&mat[2][0]==mat[0][2])
			return Character.toString(mat[0][2])+" wins diagonally!";
		return "cat's game - no winner!s";
	}

	public String toString()
	{
		String output="";
        for(char[] mRow:mat ){
			for(char m:mRow){
				output+=m+" ";
			}
			output+="\n";
		}

		return output+getWinner()+"\n\n";
	}
}