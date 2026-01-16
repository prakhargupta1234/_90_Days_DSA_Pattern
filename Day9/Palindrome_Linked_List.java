package Day9;

public class Palindrome_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean isPalindrome(ListNode head) {
	        ListNode slow= head;
	        ListNode fast = head;
	        while(fast!= null&& fast.next!= null){
	            slow= slow.next;
	            fast= fast.next.next;
	        }

	        ListNode n1= reverseLL(slow);
	        ListNode n2= head;
	        while(n1!= null&&n2!= null){
	            if(n1.val!= n2.val){
	                return false;
	            }
	            n1= n1.next;
	            n2= n2.next;

	        }
	        return true;
	    }

	    ListNode reverseLL(ListNode curr){
	        ListNode prev= null;
	        while(curr!= null){
	            ListNode next= curr.next;
	            curr.next= prev;
	            prev= curr;
	            curr= next;
	        }
	        return prev;
	    }
}
