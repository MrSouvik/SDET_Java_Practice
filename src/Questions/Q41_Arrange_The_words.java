package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// Arrange the word based on the size in the string “I am doing well”  should be “doing well am I ”

public class Q41_Arrange_The_words {
	public static void main(String[] args) {
		String str = "I am doing well";
		
		String output = usingLambdaExpression(str);
		
		System.out.println("Using lambda expression : "+output);
		
		output = arrangeWords(str);
		System.out.println("Output : "+output);
	}

	private static String arrangeWords(String str) {
		String words[] = str.split(" ");
		HashMap<Integer,String> map = new HashMap<>();
		for(String s : words) {
			map.put(s.length(),s);
		}
		Set<Entry<Integer, String>> size = map.entrySet();
		int nums[] = new int[words.length];
		int i = 0;
		for(Entry  e : size) {
			nums[i] = (int) e.getKey();
			i++;
		}
		Arrays.sort(nums);
		String ans = "";
		
		for(int j = nums.length -1; j>=0; j--) {
			ans = ans+" "+map.get(nums[j]);
		}
		return ans.trim();
	}

	private static String usingLambdaExpression(String str) {
		String words[] = str.split(" ");
		
		Arrays.sort(words, (a,b)->b.length() - a.length());
		
		return String.join(" ", words);
	}
}
