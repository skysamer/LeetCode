package chap7;

import java.util.Arrays;

public class ArrayPartition {
	
	 public static int arrayPairSum(int[] nums) {
		 int ans=0;
		 
		 Arrays.sort(nums);
		 
		 for(int i=0; i<nums.length; i++) {
			 if(i%2==0) {
				 ans+=nums[i];
			 }
		 }
		 return ans;
	 }

	public static void main(String[] args) {
		int[] nums = {1, 4, 3, 2};
		
		System.out.println(arrayPairSum(nums));
	}

}
