package chap8;


public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
		ListNode node=null;
		
		while(head!=null) {
			ListNode tmp=head;
			head=head.next;
			tmp.next=node;
			node=tmp;
		}
		
		return node;
    }

}
