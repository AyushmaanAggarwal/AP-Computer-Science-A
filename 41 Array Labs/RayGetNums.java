public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int[] nums = new int[3];
        int index = 0;
        for(int r:ray){
            if(r>11){
                nums[index] = r;
                index++;
            }
            if(index==3){
                return nums;
            }
        }
		return nums;
	}
}