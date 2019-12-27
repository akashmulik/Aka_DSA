package dsa.sorting;

/*
 * This algorithm is called as bubble sort because element propogates further (bubbles up towards end ) by comparing 
 * it with other elements. In each iteration we start with two starting adjacent elements and compare them. If 
 * first element is greater than second one then we just swap them (assuming we need to sort the array in 
 * ascending order ) otherwise move forward. So like this largest element will propogate to the end. So 
 * in next iteration we will just traverse upto last-1 elements because we have already put largest element
 *  at last position so no need to worry about that.
 */

public class BubbleSort {

	// An optimized version of Bubble Sort
	static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	// Function to print an array
	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}
