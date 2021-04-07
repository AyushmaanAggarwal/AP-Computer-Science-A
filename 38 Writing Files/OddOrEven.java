import static java.lang.System.*;

public class OddOrEven
{
	private int number;

	public OddOrEven()
	{
        number = 0;
	}

	public OddOrEven(int num)
	{
        number = num;
	}

	public void setNum(int num)
	{
        number = num;
	}

	public boolean isOdd( )
	{
		return (number%2==1);
	}

	public String toString()
	{
        if(isOdd())
            return number+" is odd.\n\n";
		return number+" is even.\n\n";
	}
}