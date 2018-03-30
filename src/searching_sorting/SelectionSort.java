package searching_sorting;

import java.util.Scanner;

public class SelectionSort {
	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
	}
	public static void selectionSort(int arr[]){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++) {
			int minEleIdx = i;
			for(int j = i+1 ; j < n ; j++) {
				if(arr[minEleIdx] > arr[j])
					swap(arr, minEleIdx, j);
			}
		}	
	}
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
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
		selectionSort(arr);
		printArray(arr);
	}
}
