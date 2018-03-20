package difficulty.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            q.add(num);    
        }
        
        while(k != 1){
            q.poll();
            k--;
        }
        
        return q.poll();
    }

}
