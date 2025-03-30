package Questions;

public class Q28_RemoveDuplicateFromString {
	//Write a java program to remove duplicates from given string
	public static void main(String[] args) {
		String str = "aabbcccc";
		String ans = "";
		for(int i = 0; i<str.length(); i++) {
			String s =  String.valueOf(str.charAt(i));
			if(!ans.contains(s)) {
				ans = ans.concat(s);
			}
		}
		System.out.println(ans);
	}
}
