package Questions;

import java.util.HashMap;

//Count words in a string
public class Q36_Count_words {
	public static void main(String[] args) {
		String str = "What is your name? What is this? What is your father name?";
		HashMap<String,Integer> map = new HashMap<>();
		String words[] = str.split(" ");
		
		for(String s : words) {
			if(map.get(s) == null) {
				map.put(s,1);
			}
			else {
				int count = map.get(s);
				map.put(s, ++count);
			}
		}
		
		System.out.println(map);
	}
}
