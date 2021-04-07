import java.util.Scanner;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
       setLine(s);
   }

	public void setLine(String s)
	{
        line = s;
	}

	public int getCount()
	{
		int count=0;
        Scanner lines = new Scanner(line);
        while(lines.hasNextInt()){
            lines.nextInt();
            count++;
        }
		return count;
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