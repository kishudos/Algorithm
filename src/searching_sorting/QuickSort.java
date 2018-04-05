/**
 * 
 */
package searching_sorting;

import java.util.Scanner;

/**
 * This is quick sort algorithm
 * 
 * @author equester
 * @date 30-Mar-2018
 */
public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	/**
	 * TODO int
	 */
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int smallerThanPivotIndex = low - 1;
		
		for(int j = low; j<high; j++) {
			if(arr[j]<=pivot) {
				smallerThanPivotIndex++;
				swap(arr, smallerThanPivotIndex, j);
			}
		}
		smallerThanPivotIndex++;
		swap(arr, smallerThanPivotIndex, high);
		return 0;
	}
	
	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
	}
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/**
	 * TODO void
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		printArray(arr);
		quickSort(arr, 0, 4);
		printArray(arr);
	}

}
