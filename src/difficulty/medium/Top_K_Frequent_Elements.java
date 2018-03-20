package difficulty.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Top_K_Frequent_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    class node {
        int num;
        int count;
        node(int num, int count){
            this.num = num;
            this.count = count;
        }
    }
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, node> mapCount = new HashMap<>();
        PriorityQueue<node> res = new PriorityQueue<>((p1,p2) -> p2.count- p1.count);
        LinkedList<Integer> ans = new LinkedList<>(); 
        
        for(int num : nums){
            if(mapCount.containsKey(num)){
                node current = mapCount.get(num);
                current.count++;
                
            } else {
                mapCount.put(num, new node(num, 1));
            }
        }   
      //  addAll(map.entrySet());
        res.addAll(mapCount.entrySet());
        for(int i = 0 ; i <= k; i++) {
        	ans.add(res.poll().num);
        }
        return ans;
    }
    public List<Integer> topKFrequent1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.containsKey(num)? map.get(num) + 1 : 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pque = 
            new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
        pque.addAll(map.entrySet());
        List<Integer> ret = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            ret.add(pque.poll().getKey());
        }
        return ret;
    }
}
