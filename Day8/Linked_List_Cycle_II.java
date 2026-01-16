package Day8;

public class Linked_List_Cycle_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ListNode detectCycle(ListNode head) {
         ListNode slow= head;
        ListNode fast= head;
        while(fast!= null&& fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow== fast){
                slow= head;
                while(fast!=slow){
                    fast = fast.next;
                    slow= slow.next;
                }
                return slow;
            }
        }

        return null;
    }
}
