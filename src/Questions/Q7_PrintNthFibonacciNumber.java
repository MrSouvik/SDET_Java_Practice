package Questions;

import java.util.ArrayList;

public class Q7_PrintNthFibonacciNumber {
	public static void main(String[] args) {
		//Write a program to print n'th fibonacci scerise
		int n = 6;
		ArrayList<Integer> fibList = new ArrayList<>();
		
		fibList.add(0);
		fibList.add(1);
		
		for(int i = 2; i<n; i++) {
			fibList.add(fibList.get(i-2)+fibList.get(i-1));
		}
		System.out.println("Fibonacci List : "+fibList);
	}
}
