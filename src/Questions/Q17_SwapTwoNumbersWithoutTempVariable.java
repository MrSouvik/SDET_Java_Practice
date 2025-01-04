package Questions;

public class Q17_SwapTwoNumbersWithoutTempVariable {
	public static void main(String[] args) {
		//Write a program to swap two number without using third variable
		int x = 1;
		int y = 2;
		
		//1. using + operator
		x = x+y; //3
		y = x-y; //1
		x = x-y;
		System.out.println("using + operator X: "+x+" & Y: "+y);
		
		//2. using * operator
		
		x = 3;
		y = 4;
		
		x = x*y; //12
		y = x/y; // 3
		x = x/y; //4
		System.out.println("using * operator X: "+x+" & Y: "+y);
		
		//3. Using XOR
		int a = 5; //0101
		int b = 3; //0011
		
		a = a^b; // 0110 = 6
		b = a^b; // 0101 = 5
		a = a^b; // 0011 = 3
		
		System.out.println("using XOR X: "+x+" & Y: "+y);
		
		
		
	}
}
