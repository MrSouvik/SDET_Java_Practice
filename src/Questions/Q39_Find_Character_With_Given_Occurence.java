package Questions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

//Write a program To find the occurrences of character is 3 then  print that character in the string 
public class Q39_Find_Character_With_Given_Occurence {
	public static void main(String[] args) {
		String str = "aaabbbbbbbccccddddddggghhhhh";
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c :str.toCharArray()) {
			if(map.get(c) == null) {
				map.put(c, 1);
			}
			else {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			}
		}
		
		Set<Entry<Character, Integer>> entry = map.entrySet();
		
		for(Entry<Character, Integer> e: entry) {
			int count = e.getValue();
			if(count==3) {
				System.out.println("Character with 3 occurence : "+e.getKey());
			}
		}
	}
}
