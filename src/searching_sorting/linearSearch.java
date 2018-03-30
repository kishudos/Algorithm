package searching_sorting;

import java.util.*;

public class linearSearch {
	public static int linearSearch(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value to search");
		int ele = sc.nextInt();
		int result = linearSearch(arr, ele);
		if(result==-1) {
			System.out.println("Not Found!");
		}else {
			System.out.println("Found at index -> "+ result);
		}
	}

}
