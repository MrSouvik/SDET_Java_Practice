package Questions;

public class Q8_CheckPrime {
	public static void main(String[] args) {
		//Write a program to check whether a given number is prime
		boolean isPrime = true;
		int n = 6;
		
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				isPrime =false;
				break;
			}
		}
		
		System.out.println(n+" is a prime number : "+isPrime);
	}
}
