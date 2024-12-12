package Questions;

import java.util.HashMap;

public class Q4_PrintNumberOfOccurance {
	public static void main(String[] args) {
		//Print the number of occurrence in a given string
		String str = "abcdaabcghj";
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(map.get(c) == null) {
				map.put(c, 1);
			}
			else {
				int count = map.get(c);
				count++;
				map.put(c, count);
			}
		}
		System.out.println("Number of occerence of each character :");
		System.out.println(map);
	}
}
