import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
        name = "";
        studentList = new Student[10];
	}
	
	public Class(String name, int stuCount)
	{	
        this.name = name;
        studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
        studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}
	
    public double getStudentAverage(String stuName){
        for(Student s:studentList){
            if(s.getName().equals(stuName)){
                return s.getAverage();
            }
        }
        return -1;
    }
    
	public double getClassAverage()
	{
        double sum = 0;
        for(Student s: studentList){
            sum+=s.getAverage();
        }
		return sum/studentList.length;
	}

	public String getStudentWithHighestAverage()
	{
        Student high = studentList[0];
        for(Student s:studentList){
            if(s.getAverage()>high.getAverage()){
                high = s;
            }
        }
		return high.getName();
	}

	public String getStudentWithLowestAverage()
	{
		Student low = studentList[0];
        for(Student s:studentList){
            if(s.getAverage()<low.getAverage()){
                low = s;
            }
        }
		return low.getName();
	}
	
	public String getFailureList(double failingGrade)
	{
        String output = "";
        for(Student s:studentList){
            if(s.getAverage()<60){
                output+=s.getName()+" ";
            }
        }
		return output;
	}
	
	public String toString()
	{
		String output = name+"\n";
        for(Student s:studentList){
            output+=s.toString()+"    "+s.getAverage()+"\n";
        }
        return output;
	}  	
}