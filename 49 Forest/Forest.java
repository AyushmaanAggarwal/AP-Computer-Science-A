import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		//load stuff into the grid	
        grid = new Thing[rows][cols];
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                grid[i][j] = new Thing(typeList[(int)(Math.random()*typeList.length)], nameList[(int)(Math.random()*nameList.length)], Math.random()*35);
            }
        }	
	}

	public int setTrappedToNull( )
	{
        int removed = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] != null && isTrapped(i, j)){
                    grid[i][j] = null;
                    removed ++;
                }
                
            }
        }
		return removed;
	}
	
	  //if location ! a rock && 
	  //is surrounded by > 5 trees or rocks larger than 10
	public boolean isTrapped( int r, int c)
	{
        if(!grid[r][c].getType().equals("rock")){ //Check if object is not a rock
            int count = 0;
            //Count number of trees and rocks surrounding object with size>10
            for(int i1 = r-1; i1<=r+1; i1++){
                for(int j1 = c-1; j1<=c+1; j1++){
                    if(inBounds(i1,j1) && grid[i1][j1] != null){
                        if(grid[i1][j1].getType().equals("rock")||grid[i1][j1].getType().equals("tree")){
                            if(grid[i1][j1].getSize()>=10){
                                count++;
                            }
                        }
                    }
                }
            }
            //set to null if count is >=5
            if(grid[r][c].getType().equals("tree")){
                 count --;   
            }
            if(count >=5){
                
                return true;
            }
        }   
        return false;
	}

	private boolean inBounds( int r, int c)
	{
        if(r>=0 && c>=0 && r<grid.length && c<grid[0].length){
            return true;
        }
		return false;
	}


	public String toString()
	{
        String output = "";
        for(Thing[] gridRow:grid){
            for(Thing g:gridRow){
                if(g!=null){
                    output+=g.toString();
                } else {
                    output+=null;
                }
            }
            output+= "\n";
        }
		return output;
	}
}