public class AverageRunner
{
   public static void main( String args[] )
   {
      Average a = new Average("");
      a.setLine("9 10 5 20");
      System.out.println(a);
      System.out.println("average = "+a.getAverage()+"\n\n");

      a.setLine("11 22 33 44 55 66 77");
      System.out.println(a);
      System.out.println("average = "+a.getAverage()+"\n\n");

      a.setLine("48 52 29 100 50 29");
      System.out.println(a);
      System.out.println("average = "+a.getAverage()+"\n\n");

      a.setLine("0");
      System.out.println(a);
      System.out.println("average = "+a.getAverage()+"\n\n");

      a.setLine("100 90 95 98 100 97");
      System.out.println(a);
      System.out.println("average = "+a.getAverage()+"\n\n");
	}
}