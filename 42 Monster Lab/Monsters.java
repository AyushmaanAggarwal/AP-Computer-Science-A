import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
        myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
        myMonsters[spot] = m;
	}

	public Monster getLargest( )
	{   
        Monster largest = myMonsters[0];
        for(Monster m: myMonsters){
            if(m.isBigger(largest)){
                largest = m;
            }
        }
		return largest;
	}

	public Monster getSmallest( )
	{
        Monster smallest = myMonsters[0];
        for(Monster m: myMonsters){
            if(m.isSmaller(smallest)){
                smallest = m;
            }
        }
		return smallest;
	}

	public String toString()
	{
		String output = "[";
        for(Monster m:myMonsters){
            output += m.toString()+", ";
        }
		output = output.substring( 0,output.length()-2)+"]";
		return output;
	}
}