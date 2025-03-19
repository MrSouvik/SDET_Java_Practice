package Questions;
//Write a program to rotate an array to the right by a given number of steps.
public class Q27_Rotate_an_array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int k = 2;
		int length = arr.length;
		while(k>0) {
			int temp = arr[length-1];
			for(int i = length-1;i>0;i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			k--; 
		}
		
		for(int i = 0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
