import static java.lang.System.*;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Scanner kb = new Scanner(System.in);
		out.println("Enter in Social Security Number in format XXX-XX-XXXX :");
		Social So = new Social(kb.nextLine());
		So.chopAndAdd();
		out.println(So.toString());

	}
}