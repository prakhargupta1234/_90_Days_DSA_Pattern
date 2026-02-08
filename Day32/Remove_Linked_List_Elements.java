package Day32;

public class Remove_Linked_List_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev= null;
        while(temp!= null){
            if(temp.val== val){
                prev.next= temp.next;
            }else{
                 prev= temp;
            }

            temp= temp.next;
        }
        return head;
    }
}
