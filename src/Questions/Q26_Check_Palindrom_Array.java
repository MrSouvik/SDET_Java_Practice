package Questions;

public class Q26_Check_Palindrom_Array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		int end = arr.length - 1;
		int start = 0;
		boolean isPalindrom = true;
		while(start<=end) {
			if(arr[start] != arr[end]) {
				isPalindrom = false;
			}
			start++;
			end--;
		}
		if(isPalindrom) {
			System.out.println("Given array is palindrom");
		}
		else {
			System.out.println("Given array is not palindrom");
		}
	}
}
