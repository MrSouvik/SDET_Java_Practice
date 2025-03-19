package Questions;

public class Q25_Find_Second_largest_element_In_Array {
	public static void main(String[] args) {
		int arr[] = {8,7,5,8,6,9,1,0,4};
		int largest = Integer.MIN_VALUE;
		int secondlarge = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			int curr = arr[i];
			if(curr>largest) {
				secondlarge = largest;
				largest = curr;
			}
			else if(curr>secondlarge && curr!=largest) {
				secondlarge = curr;
			}
		}
		
		System.out.println("second largest element : "+secondlarge);
	}
}
