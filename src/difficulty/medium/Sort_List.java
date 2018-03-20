package difficulty.medium;

import entities.ListNode;
public class Sort_List {

	public static void main(String[] args) {
		Sort_List s = new Sort_List();
		ListNode head = new ListNode(4);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		s.sortList(head);

	}
	
    public ListNode sortList(ListNode head) {
        return dividAndMearge(head);
         
     }
     
     public ListNode dividAndMearge(ListNode head){
         if(head == null || head.next == null) {
             return head;
         }
         
         ListNode fast = head;
         ListNode slow = head;
         ListNode pre = null;
         while(fast != null && fast.next != null){
             pre = slow;
             slow = slow.next;
             fast = fast.next.next;
             
         }
         ListNode mid = slow;
         pre.next = null;
         
         ListNode left = dividAndMearge(head);
         ListNode right = dividAndMearge(mid);
         return merge(left, right);
      
     }
     
     public ListNode merge(ListNode left,  ListNode right) {
         ListNode merged = new ListNode(0);
         ListNode res = merged;
         while(left != null && right != null){
             if(left.val < right.val){
                 merged.next = left;
                 left = left.next;
                 merged = merged.next;
             } else {
                 merged.next = right;
                 right = right.next;
                 merged = merged.next;
             }
         }
         
         if(left != null){
             merged.next = left;
         }
         
         if(right != null){
             merged.next = right;
         }
         
         return res.next;
     }

}
