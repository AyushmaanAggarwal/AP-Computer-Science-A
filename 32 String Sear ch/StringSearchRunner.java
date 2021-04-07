public class StringSearchRunner{
	
	public static void main(String args[]){
		 System.out.println( search( "kittykatty", "k") );	//2
		 System.out.println( search( "kittykatty", "t") );	//4
	}
	public static int search( String str, String lk )
	{
		int cnt = 0;
		String string1 = str;
        while(string1.indexOf(lk)!=-1){
			string1 = string1.substring(string1.indexOf(lk)+lk.length());
			cnt++;
        }
        return cnt;
	}
	
	
}