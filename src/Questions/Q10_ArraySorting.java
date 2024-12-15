package Questions;

public class Q10_ArraySorting {
	public static void main(String[] args) {
		int[] numbers = {3,2,4,1};
		bubbleSort(numbers);
		
		int low = 0;
		int high = numbers.length - 1;
		quickSort(numbers,low,high);
		System.out.print("After sorting elements using Quick sort  : ");
		for(int n :numbers) {
			System.out.print(n+" ");
		}
	}

	private static void quickSort(int[] numbers, int low, int high) {
		int pivotIndex = partion(numbers,low,high);
		if(low<pivotIndex - 1) {
			quickSort(numbers, low, pivotIndex - 1);
		}
		if(pivotIndex<high) {
			quickSort(numbers, pivotIndex, high);
		}
		
		
	}

	private static int partion(int[] numbers, int low, int high) {
		int pivot = numbers[(low+high)/2];
		
		while(low<=high) {
			while(numbers[low]<pivot) {
				low++;
			}
			while(numbers[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = numbers[low];
				numbers[low] = numbers[high];
				numbers[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	private static void bubbleSort(int[] numbers) {
		int length = numbers.length;
		for(int i=0; i<length; i++) {
			for(int j = i+1; j<length ; j++) {
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
				System.out.print("i="+i+" j="+j +": " );
				for(int n :numbers) {
					System.out.print(n+" ");
				}
				System.out.println();
			}
		}
		System.out.print("After sorting elements using bubble sort  : ");
		for(int n :numbers) {
			System.out.print(n+" ");
		}
	}
}
