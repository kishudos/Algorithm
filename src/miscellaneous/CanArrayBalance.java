package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;

public class CanArrayBalance {
	public static void main(String[] args) {
		int[] test = { 2, 1, 6, 3, 2, -2 };
		ArrayList<ArrayList<Integer>> result = canBalance(test);
		if(result!=null){
			System.out.println("Yes- This array can be balanced");
			System.out.println("First part-> "+result.get(0).toString());
			System.out.println("Second part-> "+result.get(1).toString());
		}else{
			System.out.println("No - This array can not be balanced");
		}
	}

	public static ArrayList<ArrayList<Integer>> canBalance(int[] nums) {
		Arrays.sort(nums);
		ArrayList<Integer> firstPart = null;
		ArrayList<Integer> secondPart = null;
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			firstPart = new ArrayList<Integer>();
			secondPart = new ArrayList<Integer>();
			
			for (int j = 0; j < i; j++) {
				sum += nums[j];
				firstPart.add(nums[j]);
			}
			for (int j = i; j < nums.length; j++) {
				sum -= nums[j];
				secondPart.add(nums[j]);
			}
			if (sum == 0){
				result.add(firstPart);
				result.add(secondPart);
				return result;
			}
		}
		return null;
	}
}
