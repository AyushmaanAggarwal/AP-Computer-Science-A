import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter ac = new AtCounter();
		//test the code
		int[][] data = {{0,0},{2,5},{5,0},{9,9},{3,9}};
		for(int[] d:data){
			System.out.println(d[0]+" "+d[1]+" has "+ac.countAts(d[0], d[1])+" @s connected.\n");
		}
		System.out.println(ac.toString());
	}
}