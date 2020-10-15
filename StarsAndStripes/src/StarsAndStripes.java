import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes() // Defalt constructor -> empty parameters,
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n");
   }
   
   public void printASmallBox()
   {	
	   //Method call to draw the dashes
	   printTwentyDashes();
	   //Method call to draw the stars
	   printTwentyStars();
	   //Call the dashes and stars twice more
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();

   }
 
   public void printABigBox()
   { 	
	   //Method call draw small box twice
	   printASmallBox();
	   printASmallBox();
   }   
}