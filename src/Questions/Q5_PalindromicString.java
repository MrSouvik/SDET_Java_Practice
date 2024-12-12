package Questions;

public class Q5_PalindromicString {
	public static void main(String[] args) {
		//Write a program to check whether a string is palindrom or not
		boolean isPalindrom = true;
		String str = "madam";
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPalindrom = false;
			}
			i++;
			j--;
		}
		System.out.println("Is Palindrome : "+isPalindrom);
	}
}
