package chap9;

import java.util.LinkedList;
import java.util.Queue;

class MyStack{
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        if(q1.isEmpty()) {
        	q1.add(x);
        	while(!q2.isEmpty()) {
        		q1.add(q2.poll());
        	}
        }
        else if(q2.isEmpty()) {
        	q2.add(x);
        	while(!q1.isEmpty()) {
        		q2.add(q1.poll());
        	}
        }
    }
    
    public int pop() {
    	if(q1.isEmpty()) {
    		return q2.poll();
    	}
    	else {
    		return q1.poll();
    	}
        
    }
    
    public int top() {
    	if(q1.isEmpty()) {
    		return q2.peek();
    	}
    	else {
    		return q1.peek();
    	}
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

public class ImplementStackUsingQueue {
	
}
