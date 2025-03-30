package Questions;

public class Q31_Sort_Array_In_assending_Desending_without_Using_Sorting_method {
	public static void main(String[] args) {
		int nums [] = {1,5,8,0,6,3,7,9};
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("Printing array afatr sorting in assending order - ");
		for(int k : nums) {
			System.out.print(k+ " ");
		}
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("\nPrinting array afatr sorting in descending order - ");
		for(int k : nums) {
			System.out.print(k+ " ");
		}
	}
}
