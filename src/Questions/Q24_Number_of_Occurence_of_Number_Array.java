package Questions;

import java.util.HashMap;

public class Q24_Number_of_Occurence_of_Number_Array {
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,4,4,5,5,6};
		int size = arr.length;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < size; i++) {
			if(map.get(arr[i])==null) {
				int c = 1;
				map.put(arr[i], c);
			}
			else {
				int c = map.get(arr[i]);
				c++;
				map.put(arr[i], c);
			}
		}
		System.out.println("Printing no of occurence : "+map);
	}
}
