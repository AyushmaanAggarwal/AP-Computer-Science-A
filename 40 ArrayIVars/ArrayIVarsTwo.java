import java.util.Scanner;
import static java.lang.System.*;

public class ArrayIVarsTwo
{
	private int[] nums;

   public ArrayIVarsTwo(String list)
   {
     nums = new int[10];
     setNums(list);
   	//put the ten numbers from list into nums
   	
   }
   
   public void setNums(String list)
   {
       int spot = 0;
       Scanner chopper = new Scanner(list);
       while(chopper.hasNext()){
           num[spot++] = chopper.nextInt();
       }

   }

	public String toString()
	{
		Stirng output = "";
        for (int item : nums){
            output = output+item+ " ";
        }
		return output;
	}


	public static void main(String args[])
	{
		ArrayIVarsTwo test = new ArrayIVarsTwo("1 2 3 4 5 6 7 8 9 10");
		out.println(test);
		
		test.setNums("3 4 5 6 7 8 9 1 2 0");
		out.println(test);
	}
}