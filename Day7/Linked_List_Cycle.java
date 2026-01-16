package Day7;

public class Linked_List_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public boolean hasCycle(ListNode head) {
	        if(head == null){
	            return false;
	        }

	        ListNode fast= head;
	        ListNode slow= head;
	        while(fast != null&&fast.next!= null){

	            fast = fast.next.next;
	            slow = slow.next;
	             if(fast!= null&& fast == slow){
	                return true;
	            }
	        }

	        return false;
	    }
}

