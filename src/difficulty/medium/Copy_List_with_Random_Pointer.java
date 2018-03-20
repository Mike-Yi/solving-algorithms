package difficulty.medium;

import java.util.HashMap;

import entities.RandomListNode;

public class Copy_List_with_Random_Pointer {

	public static void main(String[] args) {
		RandomListNode a = new RandomListNode(-1);
		a.random = null;

	}
	
    public RandomListNode copyRandomList(RandomListNode head) {
        
        RandomListNode res = new RandomListNode(0);
        RandomListNode temp = res;
        HashMap<Integer, RandomListNode> map = new HashMap<>();
        RandomListNode current = head;
        
        while(current != null) {
            
            if(!map.containsKey(current.label)){
                map.put(current.label, new RandomListNode(current.label));
            }
            
            if(current.random != null && !map.containsKey(current.random.label)){
                map.put(current.random.label, new RandomListNode(current.random.label));
            }
            
            RandomListNode currentNode = map.get(current.label);
            RandomListNode currentRandom = (current.random != null) ? map.get(current.random.label) : null;
            
            currentNode.random = currentRandom;
            temp.next = currentNode;
            
            
            temp = temp.next;
            current = current.next;    
        }
        
        return res.next;
        
    }

}
