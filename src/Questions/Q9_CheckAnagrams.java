package Questions;

import java.util.Arrays;

public class Q9_CheckAnagrams {
		public static void main(String[] args) {
			//Write a program to check whether two string are anagram or not.
			String str1 = "Brag";
			String str2 = "Grab";
			
			//Converting to lowercase
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			//checking length, if length is not equal then both are not anagram
			if(str1.length() != str2.length()) {
				System.out.println("Not anagram");
			}
			else {
				//Converting string into char array
				char[] string1 = str1.toCharArray();
				char[] string2 = str2.toCharArray();
				
				//Sorting string
				Arrays.sort(string1);
				Arrays.sort(string2);
				
				//checking both array are equal or not
				if(Arrays.equals(string1, string2)) {
					System.out.println("Both String are anagram");
				}
				else {
					System.out.println("Not anagram");
				}
			}
			
		}
}
