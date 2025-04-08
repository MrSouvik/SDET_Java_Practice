package Questions;

import java.util.HashMap;

// Remove duplicates from the string Input is  String[] input={"abba", "babc","12abbcd"}; Output= abc12d

public class Q37_Remove_Duplicates_Chars_form_String {
	public static void main(String[] args) {
		String[] input={"abba", "babc","12abbcd"};
		StringBuffer output = new StringBuffer();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(String characters : input) {
			
			for(char c : characters.toCharArray()) {
				
				if(!map.containsKey(c)) {
					map.put(c, 1);
					output.append(c);
				}
			}
		}
		
		System.out.println("Output : "+output);
	}
}
