import java.util.*;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		LeapYear ly = new LeapYear();
		if (ly.isLeapYear(year)) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is NOT a leap year");
		}
		if (ly.isLeapYear(209)) {
			System.out.println(209+" is a leap year");
		} else {
			System.out.println(209+" is NOT a leap year");
		}
		if (ly.isLeapYear(2131)) {
			System.out.println(2131+" is a leap year");
		} else {
			System.out.println(2131+" is NOT a leap year");
		}
	}
}
