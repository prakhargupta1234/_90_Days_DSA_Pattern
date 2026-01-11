package Day4;

public class Remove_Nth_Node_From_End_of_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        int c=0;
	        ListNode node= head;
	        while(node!= null){
	            c++;
	            node= node.next;
	        }

	        int t= c-n;
	        if(t==0){
	            return head.next;
	        }
	        node =head;
	        for(int i=0;i<t-1;i++){
	            node = node.next;
	        }
	        node.next= node.next.next;
	        return head;
	    }
}
