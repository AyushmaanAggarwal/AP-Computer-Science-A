import java.util.Scanner;

public class Average
{
   private String line;

   public Average()
   {
	   setLine("");
   }

   public Average(String s)
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


	public int getSum()
	{
		int total = 0;
		Scanner lines = new Scanner(line);
        while(lines.hasNextInt()){
            total += lines.nextInt();
        }
		return total;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()*1.0/getCount();

		return average;
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