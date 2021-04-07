public class DigitAdder {
    public static int go( int num )
	{
		int n = num;
        int sum = 0;
        while(n>=1){
            sum += n%10;
            n/=10;
        }
		return sum;
	}
}
