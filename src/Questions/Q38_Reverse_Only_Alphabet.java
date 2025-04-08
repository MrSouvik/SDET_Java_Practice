package Questions;

import java.util.Stack;

//Reverse only alphabet 
public class Q38_Reverse_Only_Alphabet {
	public static void main(String[] args) {
		String str = "123a&%b01c;.,/";
		Stack<Character> st = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				st.push(c);
			}
		}
		StringBuffer sb = new StringBuffer();
		int stakeSize = st.size();
		while(stakeSize!=0){
			sb.append(st.pop());
			stakeSize--;
		}
		System.out.println(sb);
	}
}
