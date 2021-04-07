import static java.lang.System.*;
import java.util.Scanner;

public class TheLine
{
   private String line;

   public TheLine()
   {
       line = "";
   }

   public TheLine(String s)
   {
       line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
        Scanner split = new Scanner(line);
        while(split.hasNext()){
            int splitNum = split.nextInt();
            largest = (splitNum>largest)?splitNum:largest;
        }
        return largest;
	}

	public String toString( )
	{
		return line+" - Largest == "+getLargest();
	}
}