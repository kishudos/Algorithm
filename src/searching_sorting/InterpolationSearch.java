package searching_sorting;

import java.util.Scanner;
//It is better than binary search O(log logn), In worst case it can take upto O(n)
public class InterpolationSearch {
	public static int interpolationSearch(int[] arr, int ele){
		int lo = 0, hi = arr.length-1;
		
		while(lo<=hi && ele>=arr[lo] && ele<=arr[hi]){
			//pos = lo + [(hi-lo) / (arr[hi]-arr[Lo]) * (x-arr[lo]) ]
			int pos = lo + (((hi-lo)/(arr[hi]-arr[lo]))*(ele-arr[lo]));
			
			if(arr[pos]==ele)
				return pos;
			if(arr[pos]<ele)
				lo = pos+1;
			else
				hi = pos-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to search");
		int x = sc.nextInt();
		int index=0;
		if ((index=interpolationSearch(arr, x))!=-1) {
			System.out.println("Found at index "+index);
		} else {
			System.out.println("Not Found");
		}
	}
}
