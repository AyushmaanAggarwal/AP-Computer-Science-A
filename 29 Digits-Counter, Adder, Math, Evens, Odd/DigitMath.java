public class DigitMath {
    public static int countDigits( int number )
	{
        int num = number;
        int counter = 1;
        while(num>=10){
            num/=10;
            counter++;
        }
		return counter;
	}

   public static int sumDigits( int number )
	{
		int n = number;
        int sum = 0;
        while(n>=1){
            sum += n%10;
            n/=10;
        }
		return sum;
	}

	//method go must call countDigits and sumDigits
	//to receive full credit
	public static double go( int number )
	{
		return 1.0*sumDigits(number)/countDigits(number);
	}
}
