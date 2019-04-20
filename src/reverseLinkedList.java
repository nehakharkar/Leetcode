public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

}

class reverseLinkedList {
	public ListNode reverseList(ListNode curr) {
		ListNode prev = null;
		ListNode next = null;s
		while (curr != null) 
		{
			next = curr.next;
			curr.next= prev;
			prev= curr;
			curr= next;
		}
		return prev;
	}

}