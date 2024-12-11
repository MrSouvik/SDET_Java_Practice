package Questions;

public class Q3_FindLargeElementInArray {
	public static void main(String[] args) {
		int[] number = {5,4,3,6,7,8,2};
		int large = findLargeNumber(number);
		System.out.println("Large Number : "+large);
		int small = findSmallNumber(number);
		System.out.println("Small Number : "+small);
		
	}

	private static int findSmallNumber(int[] number) {
		int smallNum = Integer.MAX_VALUE;
		for(int n : number) {
			if(smallNum>n) {
				smallNum = n;
			}
		}
		return smallNum;
	}

	private static int findLargeNumber(int[] number) {
		int largeNum = Integer.MIN_VALUE;
		for(int n : number) {
			if(largeNum<n) {
				largeNum = n;
			}
		}
		return largeNum;
	}
}
