package Questions;
//Count Vowel in a string
public class Q34_count_vowel {
	public static void main(String[] args) {
		String str = "I am Souvik ! I am a Test Automation Engineer";
		int vowelCount = 0;
		
		for(char c : str.toCharArray()) {
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowelCount++;
			}
		}
		
		System.out.println("Vowel Count : "+vowelCount);
	}
}
