package searching_sorting;

import java.util.Scanner;

//O(log n)

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);
		System.out.println("Enter element to search");
		int searchElement = sc.nextInt();
		int result = binarySearchRec(arr, 0, n - 1, searchElement);
		if (result == -1)
			System.out.println("Not found!");
		else
			System.out.println("Found at index -> " + result);

	}

	private static int binarySearchItr(int[] arr, int searchElement) {
		int f = 0, l = arr.length - 1;
		while (f <= l) {
			int m = (f + l) / 2;
			if (arr[m] == searchElement)
				return m;
			else if (arr[m] > searchElement)
				l = m - 1;
			else
				f = m + 1;
		}
		return -1;
	}

	private static int binarySearchRec(int[] arr, int first, int last, int searchElement) {
		if (last > first)
			return -1;
		int midIndex = (first + last) / 2;
		if (searchElement == arr[midIndex]) {
			return midIndex;
		} else if (searchElement < arr[midIndex]) {
			return binarySearchRec(arr, first, (midIndex - 1), searchElement);
		} else {
			return binarySearchRec(arr, (midIndex + 1), last, searchElement);
		}
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
