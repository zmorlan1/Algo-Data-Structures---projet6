
public class MbamiLuka_06 
{
	//*************************************************************************
	public static void main ( String[]args)
	{
		int [] numsArr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		
		numsArr = shellSort(numsArr);
		
		printArray (numsArr);
	}
	//*************************************************************************
	/*
	 * This method uses the shell sort method to arrange an int array in
	 * ascending order. Sub-arrays are used
	 * 
	 * @param	arr		This is the array which is taken for sorting
	 * 
	 * @return	arr		A sorted version of a specified array
	 */
	public static int[] shellSort( int [] arr)
	{	
		int gap;							// Gap between each element to swap
		gap = ( int) arr.length / 2;
		
		while ( gap >= 1)
		{
			for (int i = 0; i < gap; i++)
			{
				gapInsertionSort ( arr, gap);
			}
			gap /= 2;
		}
		
		return arr;
	}
	
	//*************************************************************************
	/*
	 * This method sorts pairs of integers n elements apart using the concept 
	 * of insertion sort.
	 * 
	 * @param		arr		Specified array to be sorted
	 */
	public static void gapInsertionSort ( int[]arr, int gap)
	{
		for ( int i = 0; i < arr.length; i += gap)
		{
			int currValue = arr[i];
			int index = i;
			
			
			while ( index >= gap && arr[index - gap] > currValue)
			{
				arr[index] = arr[index-gap];
			    index -= gap;
			}
			
			arr[index] = currValue;
		}
	}
	//*************************************************************************
	/*
	 * This method will print the values of a given array
	 */
	public static void printArray ( int [] arr)
	{
		for ( int i = 0; i < arr.length; i++)
		{
			String line = arr[i] + "  ";
			System.out.print ( line);
		}
	}
	//*************************************************************************
}
