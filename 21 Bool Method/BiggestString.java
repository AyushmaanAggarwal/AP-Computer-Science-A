public class BiggestString
{
	public static String getBiggest( String a, String b, String c )
	{
		if(a.compareTo(b)>0&&a.compareTo(c)>0){
			return "biggest = "+a;
		} else if(b.compareTo(a)>0&&b.compareTo(c)>0) {
			return "biggest = "+b;
		} else if(c.compareTo(a)>0&&c.compareTo(b)>0){
			return "biggest = "+c;
		} else {
			return "2 Strings are the same";
		}
	}
}