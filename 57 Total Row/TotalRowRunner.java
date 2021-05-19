public class TotalRowRunner
{
	public static void main( String args[] )
	{
		int[][] array = {{1,2,3},{5,5,5,5}};
		int[][] array1 = {{1,2,3},{5},{1},{2,2}};
		int[][] array2 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println(TotalRow.getRowTotals(array));
		System.out.println(TotalRow.getRowTotals(array1));
		System.out.println(TotalRow.getRowTotals(array2));
	}
}


