package difficulty.medium;
import entities.*;

public class Reverse_Linked_List_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Linked_List_II  s = new Reverse_Linked_List_II();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		
		
		s.reverseBetween(head, 1, 4);
	}
	
    ListNode tempHead;
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = head;
        ListNode mainTail = null;
        for(int i = 1; i < m; i++) {
        	mainTail = node;
            node = node.next;
        }
        ListNode partHead = node;
        
        
        for(int i = 1; i < n - m + 1; i++){
            node = node.next;       
        }
        ListNode lastTemp = node.next;
        node.next = null;
        if(mainTail != null) mainTail.next = null;
        
        reverse(partHead).next = lastTemp;
        if(mainTail != null) mainTail.next = tempHead;
        
        return (m == 1) ? tempHead : head;
    }
    
    public ListNode reverse(ListNode head){
        if(head.next == null) {
            tempHead = head;
            return head;
        }
        ListNode pre = reverse(head.next);
        pre.next = head;   
        return head;
    }

}
