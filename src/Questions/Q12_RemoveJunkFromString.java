package Questions;

public class Q12_RemoveJunkFromString {
	public static void main(String[] args) {
		//Remove junk/special character from string 
		String str = "$#@!^&S*()_+|}{:?o><,.u/;'v[i]=-k`~\r\n";
		
		//Regular Expression : [^a-zA-Z0-9] // Not symbol -> ^
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
	}
}
