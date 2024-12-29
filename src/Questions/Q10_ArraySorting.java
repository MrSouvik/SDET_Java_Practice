package Questions;

public class Q10_ArraySorting {
	public static void main(String[] args) {
		
		// Writing a program to implement sorting elements in an unsorted array
		int[] numbers = {3,2,4,1};
		int low = 0;
		int high = numbers.length - 1;
		
		//bubbleSort(numbers);
		//quickSort(numbers,low,high);
		//selectionSort(numbers);
		//insertionSort(numbers);
		mergeSort(numbers,low,high);
		System.out.print("After sorting elements: ");
		for(int n :numbers) {
			System.out.print(n+" ");
		}
	}

	private static void mergeSort(int[] numbers, int low, int high) {
		if(low<=high) {
			return;
		}
		int mid  = (high + low)/2;
		//sort first and second halves
		mergeSort(numbers, low, mid);
		mergeSort(numbers, mid+1, high);
		//Merge the sorted halves
		merge(numbers,low,high, mid);
		
	}

	private static void merge(int[] numbers, int low, int high, int mid) {
		int merged[] = new int[high-low+1];
		
		int index_1 = low;
		int index_2 = mid + 1;
		int i = 0;
		
		while(index_1<=mid && index_2<=high) {
			if(numbers[index_1]>numbers[index_2]) {
				merged[i] = numbers[index_1];
				i++;
				index_1++;
			}
			else {
				merged[i] = numbers[index_2];
				i++;
				index_2++;
			}
		}
		while(index_1<=mid) {
			merged[i] = numbers[index_1];
			i++;
			index_1++;
		}
		while(index_2<=high) {
			merged[i] = numbers[index_2];
			i++;
			index_1++;
		}
		int j = low;
		for(int x = 0;x<merged.length;x++) {
			numbers[j] = merged[i];
		}
 	}

	private static void insertionSort(int[] numbers) {
		for(int i = 1; i<numbers.length; i++) {
			int temp = numbers[i];
			int j = i;
			while(j>0 && numbers[j-1]>temp) {
				numbers[j] = numbers[j-1];
				j = j - 1;
			}
			numbers[j] = temp;
			
		}
	}

	private static void selectionSort(int[] numbers) {
		for(int i = 0; i<numbers.length; i++) {
			int minIndex = i;
			for(int j = i+1; j<numbers.length; j++) {
				if(numbers[j]<numbers[minIndex]) {
					minIndex=j;
				}
			}
			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;
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
			for(int j = 0; j<length-i-1 ; j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
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
