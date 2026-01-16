package Day8;

public class Find_length_of_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int lengthOfLoop(Node head) {
	        // code here
	        int c=0;
	        Node slow= head;
	        Node fast= head;
	        while(fast!= null&& fast.next!= null){
	            slow= slow.next;
	            fast= fast.next.next;
	            if(slow== fast){
	                 slow= slow.next;
	                 c++;
	                while(fast!=slow){
	                    slow= slow.next;
	                    c++;
	                }
	                return c;
	            }
	        }

	        return c;
	    }

}
