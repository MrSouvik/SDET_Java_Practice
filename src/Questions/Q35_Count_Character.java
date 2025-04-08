package Questions;

import java.util.HashMap;

//Count each character in a String
public class Q35_Count_Character {
	public static void main(String[] args) {
		String str = "I am Souvik ! I am a Test Automation Engineer";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			if(map.get(c) == null) {
				map.put(c, 1);
			}
			
			else {
				int count = map.get(c);
				map.put(c, ++count);
			}
		}
		System.out.println(map);
	}
}
