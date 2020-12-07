public class Dog
{
	//initialize variables
	private int age;
	private String name;
	
	//2 constructor classes
	public Dog( String n )  
	{
		age = 1;
		name = n;
	}
	  
	public Dog( String n, int a )  
	{
		age = a;
		name = n;
	}
	
	//Incease age in a modifier class
	public void increaseAgeByOne()
	{
		age++;
	}
	
	//Return people years in an accessor class
	public int getPeopleAge( int val )
	{
		return val*age;
	}
	
	//Return age in an accessor class
	public int getAge()    {
		return age;
	}
	
	//Return name in an accessor class
	public String getName()    {
		return name;
	}
	
	//Return formated string in an accessor class
	public String toString()    {
		return "Dog - " + name + " " + age;
	}
}