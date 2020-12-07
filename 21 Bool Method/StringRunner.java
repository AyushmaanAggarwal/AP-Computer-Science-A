public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString s = new BiggestString();
		System.out.println("abc cba bca");
		System.out.println(s.getBiggest("abc", "cba", "bca"));
		
		System.out.println("one fourteen twenty");
		System.out.println(s.getBiggest("one", "fourteen", "twenty"));

		System.out.println("124323 20009 3434");
		System.out.println(s.getBiggest("124323", "20009", "3434"));

		System.out.println("abcde ABCDE 1234234324");
		System.out.println(s.getBiggest("abcde", "ABCDE", "1234234324"));


	}
}