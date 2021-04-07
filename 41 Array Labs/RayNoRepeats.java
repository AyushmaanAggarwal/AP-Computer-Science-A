public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{		
        for(int i1 = 0; i1<ray.length;i1++){
            for(int i2 = 0; i2<ray.length;i2++){
                if(i1!=i2 && ray[i1]==ray[i2]){
                    return false;
                }
            }
        }
		return true;
	}
}