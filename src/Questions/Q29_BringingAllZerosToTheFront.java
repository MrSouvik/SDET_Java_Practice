package Questions;

public class Q29_BringingAllZerosToTheFront {
	public static void main(String[] args) {
		int[] numbers = {0,1,5,0,9,3,0};
		int i = 0;
		int j = numbers.length-1;
		while(i<j) {
			if(numbers[i]==0) {
				i++;
//				continue;
			}
			else if(numbers[j]!=0) {
				j--;
//				continue;
			}
			else if(numbers[i]!=0 && numbers[j]==0) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}
		}
		for(int n : numbers) {
			System.out.print(n+" ");
		}
	}
}
