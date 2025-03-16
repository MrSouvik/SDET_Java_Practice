package Questions;
//Write a program to reverse the elements of an array without using an additional array.
public class Q21_Reverse_Array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int size = arr.length;
		System.out.println("Before reverse : ");
		for(int i = 0; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nAfter reverse : ");
		int start = 0;
		int end = size - 1;
		
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i = 0; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
