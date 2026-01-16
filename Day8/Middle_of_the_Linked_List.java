package Day8;

public class Middle_of_the_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow= head;
        while(fast!= null&& fast.next!= null){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
}
