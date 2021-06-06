package chap8;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		Stack<Character> stk=new Stack<Character>();
		
		for(char c:s.toCharArray()) {
			if(c=='(') {
				stk.push(')');
			}
			else if(c=='{') {
				stk.push('}');
			}
			else if(c=='[') {
				stk.push(']');
			}
			else if(stk.empty() || stk.pop()!=c) {
				return false;
			}
		}
		return stk.empty();
    }
}
