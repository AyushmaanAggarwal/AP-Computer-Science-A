public class ArrayIVars
{
	private int[] nums;

   public ArrayIVars()
   {
       nums = new int[10];
   }

	public void work()
	{
	   for(int i=0; i<nums.length;i++)
	   {
	      nums[i] = i*3+4*2;
	   }
	}

	public String toString()
	{
		String output = "";

        for (int index:nums){
            output = output+index+" ";
        }
		return output;
	}


	public static void main(String args[])
	{
		ArrayIVars test = new ArrayIVars();
		test.work();
		System.out.println(test);
		
		//output
		/*
			8 11 14 17 20 23 26 29 32 35
		*/
	}
}