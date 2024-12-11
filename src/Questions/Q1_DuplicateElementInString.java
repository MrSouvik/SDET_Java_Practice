package Questions;
import java.util.ArrayList;
import java.util.HashSet;

public class Q1_DuplicateElementInString {
	public static void usingHashSet(String[] fruits) {
		//Define a HasSet to store unique values
		HashSet<String> uniqueElement = new HashSet<>();
		//Define a HashSet to store duplicate elements
		HashSet<String> duplicateElement = new HashSet<String>();
		//Iterate over fruits array
		for(String str : fruits) {
			//adding string element one by one in HashSet, if it's successful it will return true else false
			if(!uniqueElement.add(str)) {
				//if the condition got failed element is already present in uniqueElement hashMap, so  it will add in duplicate HashMap 
				//HashMap will not store duplicate element 
				duplicateElement.add(str);
			}			
		}
		System.out.println("Duplicate Elements:");
		for(String str:duplicateElement) { //Iterating DuplicateElement HashMap and printing all values
			System.out.println(str); 
		}

	}
	public static void usingForLoop(String[] fruits) {
		ArrayList<String> ele = new ArrayList<>();
		for(int i = 0; i<fruits.length - 1; i++) {
			for(int j = i+1; j<fruits.length; j++) {
				if(fruits[i]==fruits[j]) {
					ele.add(fruits[i]);
				}
			}
		}
		System.out.println("Duplicate Element(Using loop)");
		System.out.println(ele);
	}
	public static void main(String[] args) {
		String[] fruits = {"Apple","Banana","Lemon","Apple","Lichi","Banana"};
		usingHashSet(fruits);
		usingForLoop(fruits);
	}
	
}
