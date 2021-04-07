import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster
{
	private String name;
	private int howBig;	
    private int age;
    private int weight;

	public Monster(int size, int age, int weight)
	{
		howBig = size;
        this.age = age;
        this.weight = weight;

	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }
	
	public boolean isBigger(Monster other)
	{
		return howBig > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		//call isBigger() use !
		return howBig < other.getHowBig();
	}

	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}
	
	public String toString()
	{
		return howBig+" "+weight+" "+age;
	}
}