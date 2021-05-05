package chap8;

class ListNode2 {
	int val;
	ListNode2 next;
	ListNode2() {}
	ListNode2(int val) { this.val = val; }
	ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

public class TestClass {
	public ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
		
		ListNode2 newList=new ListNode2();
		
		while(!(l1==null && l2==null)) {  //null이 아니면
			int val1=l1 !=null ? l1.val: 101;
			int val2=l2 !=null ? l2.val: 101;
			
			if(val1>=val2) {
				newList.val=val2;
				l2=l2.next;
			}
			else {
				newList.val=val1;
				l1=l1.next;
			}
		}
        return newList.next;
    }
}
