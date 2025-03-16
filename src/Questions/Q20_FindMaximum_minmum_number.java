package Questions;
//Write a program to find the maximum and minimum values in an array of integers.
public class Q20_FindMaximum_minmum_number {
	public static void main(String[] args) {
		int arr[] = {10,2,0,7,9,3,5};
		int maxNumber = findMax(arr);
		int minNumber = findMin(arr);
		
		System.out.println("Max number : "+maxNumber);
		System.out.println("Min number : "+minNumber);
	}

	private static int findMin(int[] arr) {
		int size = arr.length;
		int min = Integer.MAX_VALUE;
		for(int  i =0; i<size; i++) {
			int temp = arr[i];
			if(temp<min) {
				min = temp;
			}
		}
		return min;
	}

	private static int findMax(int[] arr) {
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<size; i++) {
			int temp = arr[i];
			if(temp>max) {
				max = temp;
			}
		}
		return max;
	}
}
