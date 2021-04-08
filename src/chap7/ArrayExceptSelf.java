package chap7;

import java.util.Arrays;

public class ArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
		int left=1;
		int right=1;
		
		int[] ans=new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			ans[i]=left;
			left*=nums[i];
		}
		
		for(int i=nums.length-1; i>-1; i--) {
			ans[i]=right*ans[i];
			right*=nums[i];
		}
		return ans;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}
