package Questions;
//Write a program to search for an element in an array and return its index. If the element is not found, display a message.
public class Q23_Search_Element {
	public static void main(String[] args) {
		int arr[] = {3,5,6,4,0,9};
		int searchEle = 60;
		int index = searchEle(searchEle,arr);
		System.out.println(index);
	}

	private static int searchEle(int ele, int[] arr) {
		int index = -1;
		for(int i =0; i<arr.length; i++) {
			
			if(ele == arr[i]) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.print("Element not found! ");
		}
		return index;
	}
}
