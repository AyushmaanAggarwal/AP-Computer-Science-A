import static java.lang.System.*;

public class StringSearch
{
	public static int search( String str, String lk )
	{
        int cnt = 0;
        for(int i = 0; i<str.length();i++){
            if(lk.equals(str.substring(i,i+1))){
                cnt++;
            }
        }
		return cnt;
	}
	
	public static void main(String args[])
	{
		 System.out.println( search( "kittykatty", "k") );	//2
		 System.out.println( search( "kittykatty", "t") );	//4
	}
}