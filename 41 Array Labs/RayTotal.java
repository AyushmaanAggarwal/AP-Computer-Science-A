public class RayTotal
{
	public static int go(int[] ray)
	{
        int sum = 0;
        for(int r:ray){
            sum+=r;
        }
		return sum;
	}
}