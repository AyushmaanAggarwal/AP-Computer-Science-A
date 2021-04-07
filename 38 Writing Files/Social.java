import java.util.Scanner;

public class Social
{
   private String socialNum;

	public Social()
	{
        socialNum = "";
	}

	public Social(String soc)
	{
        socialNum = soc;
	}

	public void setSocial(String soc)
	{
        socialNum = soc;
	}

	public int getSum()
	{
		int sum = 0;
		Scanner split = new Scanner(socialNum);
		split.useDelimiter("-");
		while(split.hasNext()){
			sum += split.nextInt();
		}
		return sum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of "+getSum();
	}
}