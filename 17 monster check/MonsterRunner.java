import java.util.Scanner;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 1st monster's name:");
		String name = kb.next();
		
		System.out.println("Enter 1st monster's size:");
	    int size = kb.nextInt();
	    
	    Monster m1 = new Monster (name, size);
	    
	    System.out.println("Enter 2st monster's name:");
		name = kb.next();
		
		System.out.println("Enter 2st monster's size:");
	    size = kb.nextInt();
	    
	    Monster m2 = new Monster (name, size);
	 	System.out.println( m1 );
		System.out.println( m2 );
		
		//method calls & appropriate responses
	    if(m1.isBigger(m2))
	    {
	    	System.out.println("Monster one is bigger than Monster two.");
    	}
		if(m1.isSmaller(m2))
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		if(m1.namesTheSame(m2))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
	
	}
}