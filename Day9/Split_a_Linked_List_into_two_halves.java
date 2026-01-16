package Day9;

public class Split_a_Linked_List_into_two_halves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public Pair<Node, Node> splitList(Node head) {
	        // Code here
	        Node slow= head;
	        Node fast= head.next;
	        while(fast!= head&& fast.next!= head){
	            slow= slow.next;
	            fast= fast.next;
	            if(fast.next!= head){
	                fast= fast.next;
	            }
	        }
	        fast.next= slow.next;
	        slow.next= head;
	        
	        return new Pair<Node, Node>(head, fast.next);
	        
	    }
}
