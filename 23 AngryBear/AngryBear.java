public class AngryBear
{
    int numOfTeeth;
    int numDaysAwake;

    public AngryBear( int one, int two )
    {
    	numDaysAwake = one;
      numOfTeeth = two;
    }

    public boolean isAngry()
    {
    	//add code here
    	return (numDaysAwake>3&&numOfTeeth<10)||(numOfTeeth==0)||(numDaysAwake>5);
    }
}
