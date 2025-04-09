package Questions;
//Remove the  duplicates from the string while maintain sentence order note that the the letter should not appear the second time 
public class Q43_Remove_duplicate_and_maintain_order {
	public static void main(String[] args) {
		String str = "a red bu bit an old red bull on his big red nose";
		
		String ans = "";
		
		for(char c : str.toCharArray()) {
			if(c == ' ' || !ans.contains(String.valueOf(c))) {
				ans+=c;
			}
		}
		
		System.out.println("Output : "+ans);
	}
}
