package Questions;

public class Q18_SwapTwoString {
	public static void main(String[] args) {
		//Write a code to swap two string without any third variable
		String a = "Hello";
		String b = "World";
		System.out.println("Before swaping - a: "+a+" b: "+b);
		a = a + b; //HelloWorld, len = 10
		b = a.substring(0,a.length()-b.length()); //Hello, len = 5
		a = a.substring(b.length());
		System.out.println("After swaing - a: "+a+" b: "+b);
	}
}
