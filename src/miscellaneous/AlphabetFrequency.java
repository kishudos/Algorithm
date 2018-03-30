package miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetFrequency {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String input = "";
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] freq = new int[255];
		
		for (int i = 0; i < input.length(); i++) {
			freq[((int) input.charAt(i))]++;
		}
		System.out.println("Character\tFrequency");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0)
				System.out.println((char) i + "\t" + freq[i]);
		}
	}

}
