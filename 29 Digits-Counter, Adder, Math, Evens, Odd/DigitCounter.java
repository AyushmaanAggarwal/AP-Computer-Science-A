public class DigitCounter
{
   public static int go( int number )
	{
        int num = number;
        int counter = 1;
        while(num>=10){
            num/=10;
            counter++;
        }
		return counter;
	}
}