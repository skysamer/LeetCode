package chap8;

public class AddTwoNum {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode answer=new ListNode();
		ListNode node=answer;
		
		int carry=0;
		
		while(l1!=null || l2!=null) {
			int sum=carry;
			
			if(l1!=null) {
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null) {
				sum+=l2.val;
				l2=l2.next;
			}
			
			carry=sum/10;
			sum%=10;
			
			ListNode tmp=new ListNode(sum);
			node.next=tmp;
			node=node.next;
		}
		
		if(carry>0) {
			ListNode tmp=new ListNode(carry);
			node.next=tmp;
		}
		
		return answer.next;
    }
	
}
