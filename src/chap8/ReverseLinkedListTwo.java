package chap8;

public class ReverseLinkedListTwo {
	
	public static ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode root=new ListNode(1);
		ListNode start=root;
		root.next=head;
		
		for(int i=1; i<left; i++) {
			start=start.next;
		}
		ListNode end=start.next;
		
		for(int i=left; i<right; i++) {
			ListNode tmp=start.next;
			start.next=end.next;
			end.next=end.next.next;
			start.next.next=tmp;
		}
		
		return root.next;
    }
	

}
