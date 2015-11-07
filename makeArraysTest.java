import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.*;
import org.junit.Test;

public class makeArraysTest {

	@Test
	// This tests to ensure the size of each array match the size of the array after it has been sorted
	public void testSizes() {
		
		// Creates the object
		makeArrays val = new makeArrays();
		
		for(int i = 0; i < 100; i++)
		{
			// Gets the size of the unsorted array
			Integer [] arr = val.getArray(i);
			int size1 = arr.length;
			
			// Sorts and gets the size of the sorted array
			Arrays.sort(arr);
			int size2 = arr.length;
			
			// Asserts true if the sizes are the same
			assertEquals(size1, size2);
		}
	}
	
	@Test
	// This test checks to make sure that the last element in the sorted array is >= to the first element
	public void testFirstAndLast() {
		
		// Creates the object
		makeArrays val = new makeArrays();
		
		for(int i = 0; i < 100; i++)
		{
			// Gets and sorts the array
			Integer arr [] = val.getArray(i);
			Arrays.sort(arr);
			
			// Gets the first and last value of the sorted array
			int first_val = arr[0];
			int last_val = arr[arr.length - 1];
			
			// Checks to make sure the last value is greater than or equal to the first value
			assertTrue(first_val <= last_val);
		}
			
	}
	
	@Test
	// This test makes sure that the sorted array contains elements found in the unsorted array
	public void testSortedContainsVals() {
		
		// Creates the project
		makeArrays val = new makeArrays();
		
		for(int i = 0; i < 100; i++)
		{
			// Gets the array from the array list and creates two arrays: one sorted, one unsorted
			Integer [] sorted_arr = val.getArray(i);
			Arrays.sort(sorted_arr);
			Integer [] unsorted_arr = val.getArray(i);
			
			// Checks to make sure that the unsorted array contains all values from the sorted array
			for(int j = 0; j < sorted_arr.length; j++)
			{
				assertTrue(Arrays.asList(unsorted_arr).contains(sorted_arr[j]));
			}
		}
	} 

}

