package Questions;

public class Q14_FindMissingNumber {
	public static void main(String[] args) {
		//Find missing number in an array
		int num[] = {1,2,3,4,6,7,8,9,10};
		int currSum = 0;
		
		for(int i=0; i<num.length;i++) {
			currSum = currSum +num[i];
		}
		
		int totalSum = 0;
		int lastIndexNumber = num[num.length-1];
		for(int j = 1;j<=lastIndexNumber; j++) {
			totalSum = totalSum + j;
		}
		
		int missingNumber = totalSum - currSum;
		System.out.println("Missing Number : " + missingNumber);
	}
}
