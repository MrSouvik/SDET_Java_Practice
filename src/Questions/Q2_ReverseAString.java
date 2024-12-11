package Questions;

public class Q2_ReverseAString {
	public static void main(String[] args) {
		String str = "Souvik Kumar Santra";
		reverseString(str);
		reverseWord(str);
	}
	
	

	private static void reverseWord(String str) {
		String newStr = "";
		String[] strArray = str.split(" ");
		for(int i = strArray.length - 1; i>=0 ; i--) {
			newStr = newStr + strArray[i] + " ";
		}
		System.out.println("Reversed Word String: "+newStr.substring(0,newStr.length()-1));
		
	}



	private static void reverseString(String str) {
		String reversedString = "";
		char[] chStr = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while(i<=j) {
			char temp = chStr[i];
			chStr[i] = chStr[j];
			chStr[j] = temp;
			i++;
			j--;
		}
		
		for(char c : chStr) {
			reversedString += c; 
		}
		System.out.println("Reversed string: "+reversedString);
	}
}
