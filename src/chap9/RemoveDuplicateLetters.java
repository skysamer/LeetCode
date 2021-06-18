package chap9;

import java.util.Stack;

public class RemoveDuplicateLetters {
	
	public String removeDuplicateLetters(String s) {
		int[] charCount=new int[26];
		boolean[] visited=new boolean[26];
		int len=s.length();
		char[] sChar=s.toCharArray();
		
		for(char c:sChar) {
			charCount[c-'a']++;
		}
		
		Stack<Character> stack=new Stack<Character>();
		int index=0;
		for(int count:charCount) {
			if(count>0) index++;
		}
		
		char[] res=new char[index];
		
		for(int i=0; i<len; i++) {
			char c=s.charAt(i);
			
			while(!stack.isEmpty() && c<stack.peek() && charCount[stack.peek()-'a']>1 && !visited[c-'a']) {
				char pop=stack.pop();
				visited[pop-'a']=false;
				charCount[pop-'a']--;
			}
			if(visited[c-'a']) {
				charCount[c-'a']--;
				continue;
			}
			stack.push(c);
			visited[c-'a']=true;
		}
		
		while(!stack.isEmpty()) {
			res[--index]=stack.pop();
		}
		
		return String.valueOf(res);
    }
}
