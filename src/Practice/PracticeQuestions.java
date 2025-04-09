package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeQuestions {
	public static void main(String[] args) {
		String input = "a b c d";
		
		char[] inputArray = input.toCharArray();
		char[] output = input.toCharArray();
		
		for(int i = 0; i<inputArray.length; i++) {
			if(inputArray[i]==' ') {
				output[i] = ' ';
			}
		}
		System.out.println();
		int start = 0;
		int end = inputArray.length -1;
		while(start<end) {
			if(inputArray[start]!=' ' && inputArray[end]!=' ') {
				output[start] = inputArray[end];
				output[end] = inputArray[start];
				start++;
				end--;
			}
			else if(inputArray[start]==' ') {
				start++;
			}
			else if(inputArray[end]==' ') {
				end--;
			}
		}
		
		System.out.println(new String(output));
	}
	
}
