package Questions;
//Write a program to count the number of even and odd numbers in an array of integers.
public class Q22_Find_odd_even_occurence {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int oddCount = 0;
		int evenCount = 0;
		
		for(int  i = 0; i < arr.length ; i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Number of oddNumber Occurence : "+oddCount);
		System.out.println("Number of evenNumber Occurence : "+evenCount);
	}
}
