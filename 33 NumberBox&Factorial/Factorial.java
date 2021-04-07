public class Factorial
{
	public static long getFactorial( int num )
	{
        long factorial=1;
        for(int i = num; i>=1;i--){
            factorial*=i;
        }
		return factorial;
	}
}