package miscellaneous;

public class ReverseStringByWords {

	public static void main(String[] args) {
		String s = "My name is krishna";
		String[] l = s.split(" ");
		int i=0,j=l.length-1;
		
		while(i<j){
			String t = l[i];
			l[i] = l[j];
			l[j] = t;
			i++;
			j--;
		}
		for(String st:l){
			System.out.println(st);
		}
	}

}
