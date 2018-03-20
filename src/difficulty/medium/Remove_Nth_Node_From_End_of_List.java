package difficulty.medium;

import entities.ListNode;

public class Remove_Nth_Node_From_End_of_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p1 = head;
        ListNode p2 = head;
        
        for(int i = 0; i < n ; i++) {
            p2 = p2.next;
        }
        
        if(p2 == null) return p1.next;
        
        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
        return head;
        
        
    }

}
