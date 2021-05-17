import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private String[][] maze;
   private int stepCounter;

	public Maze(int size, String line)
	{
        Scanner singleWord = new Scanner(line);
        maze = new String[size][size];
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                maze[i][j] = singleWord.next();
            }
        }

	}

	public boolean hasExitPath(int r, int c)
	{
        if(r>=0 && r<maze.length && c>=0 && c<maze.length && maze[r][c].equals("1")){
            maze[r][c] = "X";
            if(c==maze.length-1){
                maze[r][c] = "P";
                stepCounter++;
                return true;
            }
            if(hasExitPath(r,c+1) || hasExitPath(r-1,c) || hasExitPath(r+1,c) || hasExitPath(r,c-1)){
                maze[r][c] = "P";
                stepCounter++;
                return true;
            }
            return false;
        }
		return false;
	}

	public String toString()
	{
		String output="";
        Boolean hasEXIT = hasExitPath(0, 0);
        for(String[] ma:maze){
            for(String m:ma){
                if(m.equals("X")){
                    output += "1 ";
                }else{
                    output+=m+" ";
                }
            }
            output+= "\n";
        }
        if(hasEXIT){
            output += "exit found - "+stepCounter+" STEPS";
        } else {
            output += "exit not found";
        }
        
		return output;
	}
}