package Questions;
//Remove alphabet from given string and print integer
public class Q33_Remove_alphabate {
	public static void main(String[] args) {
		String str = "So1uv0i0k";
		
		int number  = usingAsciiValue(str);
		System.out.println("Using ASCII character: "+number);
		
		number = usingRegex(str);
		System.out.println("Using Regex : "+number);
	}

	private static int usingRegex(String str) {
		String ans = "";
		ans = str.replaceAll("[a-zA-Z]", "");
		
		return Integer.valueOf(ans);
	}

	private static int usingAsciiValue(String str) {
		String ans = "";
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				ans = ans.concat(String.valueOf(str.charAt(i)));
			}
		}
		
		return Integer.valueOf(ans);
	}
}
