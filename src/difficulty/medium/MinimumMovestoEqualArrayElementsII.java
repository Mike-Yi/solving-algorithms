package difficulty.medium;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII {

	public static void main(String[] args) {
		
		MinimumMovestoEqualArrayElementsII s = new MinimumMovestoEqualArrayElementsII();
		s.minMoves2(new int[] {1,2,3,5,7});
	}
	
    public int minMoves2(int[] nums) {
    	
        int[] dp = new int[nums.length];
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1] + ( i * (nums[i] - nums[i-1])); 
        }
        
        int minCount = dp[nums.length -1];
        int total = 0;
        for(int j = nums.length-2; j >= 0 ; j--) {
            
        	int diff = Math.abs(nums[j] - nums[j+1]);
        	total += (nums.length -1 - j) * diff;
        	dp[j] += total;
        	minCount = Math.min(dp[j], minCount);
        }
        return minCount;
    }

}
