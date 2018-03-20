package difficulty.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Rearrange_String_k_Distance_Apart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rearrange_String_k_Distance_Apart s = new Rearrange_String_k_Distance_Apart();
		s.rearrangeString("aaabbccd", 2);
	}
	
    class node{
        int count;
        char c;
        node(char c , int count){
            this.count = count;
            this.c = c;
        }
    }
    
    public String rearrangeString(String s, int k) {
        PriorityQueue<node> pq = new PriorityQueue<>((n1 , n2) -> n2.count - n1.count);
        HashMap<Character, Integer> map = new HashMap<>();
        List<node> kList = new LinkedList<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(new node(entry.getKey() , entry.getValue()));
        }
        
        int i = 0;
        String res = "";
        
        while(!pq.isEmpty()) {
            while(i < k) {
            	if(pq.isEmpty() && !kList.isEmpty()) return "";
            	node tempNode = pq.poll();
            	res += tempNode.c;
            	tempNode.count--;
            	if(tempNode.count != 0) {
            		kList.add(tempNode);
            	}
            	i++;
            }
        	for(node a : kList) {
        		pq.add(a);
        	}
        	kList.removeAll(kList);
        	i = 0;
        }

        return res;
    }

}
