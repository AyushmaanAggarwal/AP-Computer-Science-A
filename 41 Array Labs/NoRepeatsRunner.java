import java.util.*;

public class NoRepeatsRunner
{
	public static void main( String args[] )
	{			
        int[] arr = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
        System.out.println((RayNoRepeats.go(arr)));									
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1,-99};
        System.out.println((RayNoRepeats.go(arr1)));									
        int[] arr2 = {10,20,30,40,50,10,10,40,30,20,10};
        System.out.println((RayNoRepeats.go(arr2)));									
        int[] arr3 = {32767};
        System.out.println((RayNoRepeats.go(arr3)));									
        int[] arr4 = {255,255};
        System.out.println((RayNoRepeats.go(arr4)));									
        int[] arr5 = {9,10,-88,100,-555,1000};
        System.out.println((RayNoRepeats.go(arr5)));														
	}
}