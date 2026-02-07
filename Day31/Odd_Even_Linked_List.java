package Day31;

public class Odd_Even_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class ListNode {
	    int val;
	    ListNode next;

	    ListNode() {}

	    ListNode(int val) {
	        this.val = val;
	    }

	    ListNode(int val, ListNode next) {
	        this.val = val;
	        this.next = next;
	    }
	}

	
	  public ListNode oddEvenList(ListNode head) {
	        if(head== null||head.next==null){
	            return head;
	        }
	       List<Integer> ll= new ArrayList<>(); 
	       ListNode temp= head;
	       while(temp!= null&&temp.next!= null){
	            ll.add(temp.val);
	            temp= temp.next.next;
	       }
	       if(temp!= null){
	        ll.add(temp.val);
	       }
	       temp= head.next;
	        while(temp!= null&&temp.next!= null){
	            ll.add(temp.val);
	            temp= temp.next.next;
	       }
	       if(temp!= null){
	        ll.add(temp.val);
	       }

	       temp = head;
	       int idx=0;
	       while(temp!= null){
	        temp.val= ll.get(idx++);
	        temp= temp.next;
	       }
	       return head;
	    }

}
