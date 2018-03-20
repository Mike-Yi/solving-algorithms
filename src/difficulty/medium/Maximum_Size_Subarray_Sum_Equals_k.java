package difficulty.medium;

import java.util.HashMap;

public class Maximum_Size_Subarray_Sum_Equals_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum_Size_Subarray_Sum_Equals_k s = new Maximum_Size_Subarray_Sum_Equals_k();
		s.maxSubArrayLen(new int[]{1,-1,5,-2,3},3);
		
	}
	
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++) {
        	sum += nums[i];
            if(map.containsKey(sum - k)){
                maxLength = Math.max(i - map.get(sum - k), maxLength);
            } 
            map.put(sum, Math.min(map.getOrDefault(sum, nums.length) , i));
        }
        return maxLength;
    }

}
