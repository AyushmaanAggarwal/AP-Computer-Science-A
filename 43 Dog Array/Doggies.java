import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
        pups[spot]= new Dog(age,name);
	}

	public String getNameOfOldest()
	{
        Dog oldest = pups[0];
        for(Dog p: pups){
            if(p.getAge()>oldest.getAge()){
                oldest = p;
            }
        }
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngest = pups[0];
        for(Dog p: pups){
            if(p.getAge()<youngest.getAge()){
                youngest = p;
            }
        }
		return youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}