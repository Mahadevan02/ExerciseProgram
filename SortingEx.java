// Java program to demonstrate working of
// sort() method of Arrays class

// Importing Arrays class from java.util package
import java.util.Arrays;
import java.util.Collections;

// Main class
public class SortingEx {

	// Main driver method
	public static void main(String[] args)
	{
		// Custom input array
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		Integer[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Calling the sort() method present
		// inside Arrays class
		Arrays.sort(arr);

		// Printing and display sorted array
		System.out.printf("Modified arr[] : %s",
						Arrays.toString(arr));
		// Sorts arr[] in descending order
        Arrays.sort(arr1, Collections.reverseOrder());
 
        System.out.printf("\nModified arr1[] : %s",
                          Arrays.toString(arr1));
	}
}
