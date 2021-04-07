public class Grade
{
  private double value;

  public Grade( double v )
  {
      value = v;
  }
  
  public double getNumericGrade()
  {
  	return value;
  }
  
  public String getLetterGrade()
  {
    if(value>=90){
        return "A";
    } else if(value>=80){
        return "B";
    } else if(value>=70){
        return "C";
    } else if(value>=60){
        return "D";
    } else{
        return "F";
    }
  	
  }

  public String toString()
  {
  	return value+" "+getLetterGrade();
  }
}
