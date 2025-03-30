package Questions;

public class Q30_removeIntegersFromString {
	public static void main(String[] args) {
		String input = "Hon1ey3we7l8l";
		
		String result = input.replaceAll("\\d", "");
		System.out.println(result);
		
		System.out.println("Using String Builder - "+stringBuilder(input));
	}
	
	//using srtringbuilder
	public static String stringBuilder(String input) {
		StringBuilder result = new StringBuilder();
		char[] c = input.toCharArray();
		for(int i = 0; i<c.length; i++) {
			if(!Character.isDigit(c[i])) {
				result.append(c[i]);
			}
		}
		return result.toString();
	}
}
