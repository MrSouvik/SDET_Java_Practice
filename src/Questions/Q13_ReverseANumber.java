package Questions;

public class Q13_ReverseANumber {
	//Write a program to reverse a number
	public static void main(String[] args) {
		int num = 12346;
		int rev = 0;
		while(num!=0) {
			int rem = num % 10; //capturing remainder for 123456 is 6
			rev = (rev*10) + rem;
			num = num / 10; //dividing by 10
		}
		System.out.println(rev);
	}
}
