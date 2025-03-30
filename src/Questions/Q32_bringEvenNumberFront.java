package Questions;

public class Q32_bringEvenNumberFront {
	public static void main(String[] args) {
		int arr[] = {2,5,8,7,1,3,6,4,5,9};
		int i = 0;
		int j = arr.length - 1;
		while(i<j) {
			if(arr[i]%2==0) {
				i++;
			}
			else if(arr[j]%2!=0) {
				j--;
			}
			else if(arr[i]%2!=0 && arr[j]%2==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		for(int m : arr) {
			System.out.print(m+" ");
		}
	}
}
