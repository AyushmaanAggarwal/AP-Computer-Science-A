public class CountOdds {
    public static int go( int number )
	{
		int counter = 0;
        while(number!=0){
            if(number%2==1){
                counter++;
            }
            number/=10;
        }
        return counter;
    }
}
