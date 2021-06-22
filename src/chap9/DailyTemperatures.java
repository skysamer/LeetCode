package chap9;

import java.util.Stack;

public class DailyTemperatures {
	
	public int[] dailyTemperatures(int[] temperatures) {
		if(temperatures==null || temperatures.length==0) {
			return new int[0];
		}
		
		int[] ans=new int[temperatures.length];
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0; i<ans.length; i++) {
			while(!st.empty() && temperatures[st.peek()]<temperatures[i]) {
				int idx=st.pop();
				ans[idx]=i-idx;
			}
			st.push(i);
		}
		return ans;
    }
}
