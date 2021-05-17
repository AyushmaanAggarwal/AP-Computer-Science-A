import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
        int size;
        Maze maze;
        Scanner file = new Scanner(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\56 MazeRunner\\maze.dat"));
        while(file.hasNextLine()){
            size = file.nextInt();
            file.nextLine();
            maze = new Maze(size, file.nextLine());
            System.out.println(size);
            System.out.println(maze);
        }
	}
}