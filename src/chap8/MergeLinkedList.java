package chap8;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
	

public class MergeLinkedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode root=new ListNode();
		ListNode head=root;
		
		while(!(l1==null && l2==null)) {  //null이 아니면
			int val1=l1 !=null ? l1.val: 101;
			int val2=l2 !=null ? l2.val: 101;
			
			ListNode newList=new ListNode();
			
			if(val1>=val2) {
				newList.val=val2;
				l2=l2.next;
			}
			else {
				newList.val=val1;
				l1=l1.next;
			}
			root.next=newList;
			root=root.next;
		}
				
        return head.next;
    }

}
