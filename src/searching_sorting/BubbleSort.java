package searching_sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if(arr[j]>arr[j+1])
					swap(arr, j, (j+1));
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
	}
}
