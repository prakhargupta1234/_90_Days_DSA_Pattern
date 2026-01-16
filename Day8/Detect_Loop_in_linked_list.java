package Day8;

public class Detect_Loop_in_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean detectLoop(Node head) {
	        // code here
	        Node slow= head;
	        Node fast= head;
	        while(fast!= null&& fast.next!= null){
	            slow= slow.next;
	            fast= fast.next.next;
	            if(slow== fast){
	                return true;
	            }
	        }

	        return false;
	    }
}
