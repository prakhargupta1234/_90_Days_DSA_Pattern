package Day32;

public class Remove_Duplicates_from_Sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head== null|| head.next== null){
            return head;
        }

        ListNode curr= head;
        while(curr!= null){
            ListNode nn= curr.next;
            while(nn!= null&&nn.val== curr.val){
                nn= nn.next;
            }
            curr.next= nn;
            curr= nn;
        }
        return head;

    }

}
