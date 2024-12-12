package Questions;

public class Q6_FactorialOfANumber {
	public static void main(String[] args) {
		//Write a program to print factorial of a number
		int n = 4;
		int fact = 1;
		for(int i = 1; i<=n ; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
