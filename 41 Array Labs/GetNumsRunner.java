import java.util.*;

public class GetNumsRunner
{
	public static void main( String args[] )
	{	
        int[] arr = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        System.out.println(Arrays.toString(RayGetNums.go(arr)));									
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1,-99};
        System.out.println(Arrays.toString(RayGetNums.go(arr1)));									
        int[] arr2 = {10,20,30,40,50,-11818,40,30,20,10};
        System.out.println(Arrays.toString(RayGetNums.go(arr2)));									
        int[] arr3 = {32767};
        System.out.println(Arrays.toString(RayGetNums.go(arr3)));									
        int[] arr4 = {255,255};
        System.out.println(Arrays.toString(RayGetNums.go(arr4)));									
        int[] arr5 = {9,10,-88,100,-555,1000};
        System.out.println(Arrays.toString(RayGetNums.go(arr5)));									

	}
}