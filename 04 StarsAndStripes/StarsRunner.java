public class StarsRunner
{
   public static void main(String args[])
   {
	   //instantiate a StarsAndStripes object
	   StarsAndStripes SAS = new StarsAndStripes();
	   
	   //call the methods needed to make the patterns on the document
	   //print a small box 
	   SAS.printASmallBox();
	   
	   //skip two lines
	   SAS.printTwoBlankLines();
	   
	   //print a big box
	   SAS.printABigBox();
	   
	   //skip two lines
	   SAS.printTwoBlankLines();
	   SAS.printTwoBlankLines();

	   //Creating a my own pattern
	   SAS.printTwentyDashes();
	   SAS.printTwentyDashes();
	   SAS.printTwentyStars();
	   SAS.printTwentyDashes();
	   SAS.printTwentyStars();
	   SAS.printTwentyStars();
   }
}