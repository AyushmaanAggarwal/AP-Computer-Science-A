public class NumberBoxRunner
{
	public static void main ( String[] args )
	{
		//should work with any value passed to print	
		System.out.println( "run 1" );
		NumberBox.print( 3 );	
		System.out.println( "run 2" );			
		NumberBox.print( 8 );
		System.out.println( "run 3" );		
		NumberBox.print( 11);	
    }
}