package difficulty.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Task_Scheduler {

	public static void main(String[] args) {
		Task_Scheduler n = new Task_Scheduler();
		n.leastInterval(new char[]{'A','A','A','B','B','B'}, 2);
	}
	
    public int leastInterval(char[] tasks, int n) {
        int resCount = 0;
        
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(char c : tasks){
            countMap.put(c, countMap.getOrDefault(c,0) + 1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Character, Integer> entry: countMap.entrySet()){
            queue.add(entry.getValue());
        }
        
        
        while(!queue.isEmpty()){
        	List<Integer> list = new LinkedList<>();
            for(int i = 0; i <= n; i++){
                if(!queue.isEmpty()) {
                	int num = queue.poll()-1;
                	if(num != 0) list.add(num);
                	resCount++;
                } else {
                	if(list.size() != 0) {
                		resCount++;
                	}
                }
            }
            for(int i = 0; i < list.size(); i++){
                queue.add(list.get(i));
            }
           
        }
        
        return resCount;
    }
    /*
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : map) {
        	if(f != 0) {
        		pq.add(f);
        	}
        }
        
        int time = 0;
        
        while(!pq.isEmpty()) {
        	PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        	int i = 0;
        	while(!pq.isEmpty()){
        		
        		if(i <= n) {
        			int num = pq.poll() - 1;
        			if(num != 0) {
        				pq2.add(num);
        			}
        		i++;
        		time++;
        		} else {
        			pq2.add(pq.poll());
        		}
        		
        	}
        	if(!pq2.isEmpty()) {
        		pq = pq2;
        		time += n-i+1;
        	}
        	
        }
        
        return time;
    }
    */

}
