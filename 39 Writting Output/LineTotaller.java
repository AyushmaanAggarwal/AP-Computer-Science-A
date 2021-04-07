import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{		
		setLine(s);
	}

	public void setLine(String s)
	{
		line = s;
	}

	public int getSum()
	{
		int total = 0;
		Scanner lines = new Scanner(line);
        while(lines.hasNextInt()){
            total += lines.nextInt();
        }
		return total;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine();
	}
}