package Questions;
//Merge two array

public class Q42_merge_two_array {
	public static void main(String[] args) {
		int nums1[] = {1,2,3,4,5};
		int nums2[] = {6,7,8,9,10};
		
		int ans[] = new int[nums1.length + nums2.length];
		int i = 0;
		for(; i<nums1.length; i++) {
			ans[i] = nums1[i];
		}
		int j =0;
		for(; i<(nums1.length + nums2.length); i++) {
			ans[i] = nums2[j];
			j++;
		}
		
		for(int n : ans) {
			System.out.print(n+" ");
		}
	}
}
