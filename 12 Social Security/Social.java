import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social(){
		
	}

	public Social(String soc){
		socialNum = soc;
	}


	public void setWord(String w){
		socialNum = w;
	}

	public void chopAndAdd(){
		String sub = socialNum;
		
		int dash1 = sub.indexOf("-");
		int dash2 = sub.lastIndexOf("-");
		
		int num1 = Integer.parseInt(sub.substring(0,dash1));
		int num2 = Integer.parseInt(sub.substring(dash1+1,dash2));
		int num3 = Integer.parseInt(sub.substring(dash2+1));

		sum = num1+num2+num3;
	}

	public String toString(){
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}