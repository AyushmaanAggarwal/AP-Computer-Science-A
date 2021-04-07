import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		String className = file.nextLine();  //AP Computer Science AB
		int numStudents = file.nextInt();  //8
		file.nextLine(); // blank
		//make a new class
		Class theClass = new Class(className, numStudents);
		
		//read in the information for each student
        String studentName ="";
        
		while(file.hasNextLine()){
            int counter = 0;
            studentName = file.nextLine(); //name
            double[] gr = new double[file.nextInt()]; //number of grades
            file.nextLine(); //next line 
            while(file.hasNextDouble()){
                gr[counter] = file.nextDouble(); //finsih all grades
                counter++;
            }
            theClass.addStudent(counter,new Student(studentName, gr));
        }
			//read in the student name
			
			//read in the student's grades
			
			//add a new student to the class
		
		//print out the class
		
		
		out.println("Failure List = " + theClass.getFailureList(70));	
		out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());
		
		out.println("Class average = " + theClass.getClassAverage());
	}		
}