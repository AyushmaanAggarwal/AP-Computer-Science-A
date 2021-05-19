import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
      ArrayList<Integer> total = new ArrayList<Integer>();
      for(int[] mRow: m){
        int tot = 0;
        for(int mVal: mRow){
          tot += mVal;
        }
        total.add(tot);
      }
    	//add code here
		return total;
    }
}
