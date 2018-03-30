package searching_sorting;

public class MergeSort {
	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			// find middle index
			int mid = (start + end) / 2;
			// Partition array into two halves
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			// merge both partitioned halves
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		// Calculate size to create subarrays
		int size1 = mid - start + 1;
		int size2 = end - mid; // end - (mid+1)+1 = end - mid - 1 +1 = end - mid
		// Create subarrays
		int[] lArr = new int[size1];
		int[] rArr = new int[size2];

		int i, j, k = start;
		// Copy all size1 numbers of data from start index to left sub array
		for (i = 0; i < size1; i++) {
			lArr[i] = arr[start + i];
		}
		// Copy all size2 numbers of data from (mid+1) index to right sub array
		for (j = 0; j < size2; j++) {
			rArr[j] = arr[mid + 1 + j];
		}

		// Merge data and insert into original array
		i = j = 0;
		while (i < size1 && j < size2) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i++];
			} else {
				arr[k] = rArr[j++];
			}
			k++;
		}

		// Copy rest element from subarrays if any
		while (i < size1) {
			arr[k++] = lArr[i++];
		}
		while (j < size2) {
			arr[k++] = rArr[j++];
		}
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 4, 1, 3, 2, 7 };
		display(arr);
		mergeSort(arr, 0, arr.length - 1);
		display(arr);
	}
}