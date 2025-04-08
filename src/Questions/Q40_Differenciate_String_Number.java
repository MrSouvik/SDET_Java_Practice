package Questions;
//Suppose we have string “Sou1234vik” output should be separating digit and word different “Souvik1234”
public class Q40_Differenciate_String_Number {
	public static void main(String[] args) {
		String str = "Sou1234vik";
		
		String output  = UsingStringManipulation(str);
		
		System.out.println("Output using string manipulation  : "+output);
		
		output = usingRegex(str);
		System.out.println("output using regex : "+output);
	}

	private static String usingRegex(String str) {
		String letter = str.replaceAll("[0-9]", "");
		String digit = str.replaceAll("[a-zA-Z]", "");
		return letter + digit;
	}

	private static String UsingStringManipulation(String str) {
		StringBuffer letter = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				letter.append(c);
			}
			else if(Character.isDigit(c)) {
				digit.append(c);
			}
		}
		
		return letter.toString() + digit.toString();
	}
}
