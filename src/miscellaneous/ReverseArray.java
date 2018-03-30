package miscellaneous;

/***
 * This class has methods to reverse array.
 * @author equester
 *
 */
public class ReverseArray {
	private static void swapEle(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

	public static void reverseArrayItr(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			swapEle(arr, start, end);
			start += 1;
			end -= 1;
		}
	}

	public static void reverseArrayRec(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		swapEle(arr, start, end);
		reverseArrayRec(arr, start + 1, end - 1);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		reverseArrayRec(arr, 0, arr.length - 1);
		printArray(arr);
	}

}
