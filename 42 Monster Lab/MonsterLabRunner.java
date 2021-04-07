import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{			
			//ask for ht
			out.print("\nEnter the ht :: ");
			int ht = keyboard.nextInt();
			//ask for wt
			out.print("\nEnter the wt :: ");
			int wt = keyboard.nextInt();
			//ask for age
			out.print("\nEnter the age :: ");
			int age = keyboard.nextInt();
			//instantiate a new Monster() and add it to the herd			
			Monster m = new Monster(ht,age,wt);
			herd.add(i, m);
		}		
		
		System.out.println("HERD :: "+herd);
		System.out.println("SMALLEST :: "+herd.getSmallest());
		System.out.println("LARGEST :: "+herd.getLargest());
		//print out the other stats
		keyboard.close();
	}		
}