import java.util.Arrays;

public class Grades
{
	private Grade[] grades;
	
	public Grades( double[] list )
	{	
        grades = new Grade[list.length];
        for(int i = 0; i<list.length;i++){
            grades[i] = new Grade(list[i]);
        }
	}
	
	public void setGrade(int pos, double grade)
	{
        grades[pos] = new Grade(grade);
	}
	
	public double getSum()
	{
        double sum = 0;
        for(Grade g:grades){
            sum+= g.getNumericGrade();
        }
		return sum;
	}
	
	public double getLowGrade()
	{
        Grade low = grades[0];
        for(Grade g:grades){
            if(g.getNumericGrade()<low.getNumericGrade()){
                low = g;
            }
        }
		return low.getNumericGrade();
	}
	
	public double getHighGrade()
	{
		Grade high = grades[0];
        for(Grade g:grades){
            if(g.getNumericGrade()>high.getNumericGrade()){
                high = g;
            }
        }
		return high.getNumericGrade();
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output = "";
        for(Grade g:grades){
            output+= g.toString()+" ";
        }
        return output;
	}	
}