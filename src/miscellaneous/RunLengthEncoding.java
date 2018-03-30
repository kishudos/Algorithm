package miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {

	private static String decode(String encodedStr) {
		StringBuffer result = new StringBuffer();
		Pattern pattern = Pattern.compile("([a-zA-Z])(\\d+)");
		Matcher matcher = pattern.matcher(encodedStr);

		while (matcher.find()) {
			String c = matcher.group(1);
			int num = Integer.parseInt(matcher.group(2));
			while (num-- > 0)
				result.append(c);
		}
		return result.toString();
	}

	private static String encode(String inputStr) {
		StringBuffer result = new StringBuffer();
		int n = inputStr.length(), rCount = 1;

		for (int i = 0; i < n; i++) {
			rCount = 1;
			while (i + 1 < n && inputStr.charAt(i) == inputStr.charAt(i + 1)) {
				rCount++;
				i++;
			}
			result.append(inputStr.charAt(i)).append(rCount);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		try {
			inputStr = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String encodedStr = RunLengthEncoding.encode(inputStr);
		String decodedStr = RunLengthEncoding.decode(encodedStr);
		System.out.println(inputStr + " => " + encodedStr);
		System.out.println(encodedStr + " => " + decodedStr);
	}
}
