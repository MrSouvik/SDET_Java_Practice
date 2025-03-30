package Questions;

public class Q30_removeIntegersFromString {
	public static void main(String[] args) {
		String input = "Hon1ey3we7l8l";
		
		String result = input.replaceAll("\\d", "");
		System.out.println(result);
	}
}
