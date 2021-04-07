public class NumberBox
{
	public static void print( int num )
	{
		for(int i1 = 1; i1 <= num;i1++){
            System.out.printf("##%d##---##%d##---##%1$d##%n",i1,num-i1+1);
        }
	}
}