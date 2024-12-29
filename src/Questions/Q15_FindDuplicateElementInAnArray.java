package Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q15_FindDuplicateElementInAnArray {
	public static void main(String[] args) {
		//Find Duplicate element in an array
		
		String[] languages = {"Java","Python","C#","Ruby","Java","Python"};
		//1. Compare each element - Time complexity - O(N)^2
		System.out.println("-------------Using Loop----------------");
		for(int i = 0; i<languages.length; i++) {
			for(int j = i+1; j<languages.length; j++) {
				if(languages[i].equals(languages[j])) {
					System.out.println("Duplicate element : "+languages[i]);
				}
			}
		}
		//2. Using hasSet : Java collection - Time complexity  - O(N)
		System.out.println("---------------------Using HashSet -------------");
		Set<String> uniqueEle = new HashSet<String>();
		
		for(String ele : languages) {
			if(uniqueEle.add(ele)==false) {
				System.out.println("Duplicate Elemenet : "+ele);
			}
		}
		
		//Using HashMap : Java collection 
		System.out.println("----------------Using HashMap --------------");
		Map<String,Integer> elements = new HashMap<>();
		for(String ele : languages) {
			int count;
			try {
				count = elements.get(ele);
			}
			catch (Exception e) {
				count = 0;
			}
			if(count==0) {
				elements.put(ele, 1);
			}
			else {
				elements.put(ele, ++count);
			}
		}
		
		Set<Entry<String, Integer>> setEntry = elements.entrySet();
		
		for(Entry<String,Integer> ele : setEntry) {
			if(ele.getValue()>1) {
				System.out.println(ele.getKey());
			}
		}
		
		
	}
}
