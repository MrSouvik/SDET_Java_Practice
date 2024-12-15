package Questions;

public class Q11_Binary_Search {
	public static void main(String[] args) {
		//Search a element in a sorted array using binary search
		boolean isElementFound = false;
		int[] numbers = {1,2,3,4,5,6,7};
		int target = 6;
		int start = 0;
		int end  = numbers.length - 1;
		int mid =(start+end)/2;
		while(start<=end) {
			if(numbers[mid] == target) {
				System.out.println("Target Element  = "+target +" is found on index number "+mid);
				isElementFound = true;
				break;
			}
			if(numbers[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid - 1;
			}
			mid = (start+end)/2;
		}
		
		if(!isElementFound) {
			System.out.println("Element not found");
		}
	}
}
