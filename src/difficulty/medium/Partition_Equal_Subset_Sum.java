package difficulty.medium;

import java.util.Arrays;

public class Partition_Equal_Subset_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partition_Equal_Subset_Sum s = new Partition_Equal_Subset_Sum();
		s.canPartition(new int[] {
				
				1,2,5
		
		});
	}
	
    public boolean canPartition(int[] nums) {
    	if(nums.length < 2) return false;
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        if(totalSum % 2 != 0) return false;
        
        int targetSum =  totalSum / 2;
        boolean[][] dp = new boolean[nums.length][targetSum + 1];
        Arrays.sort(nums);
        
        dp[0][nums[0]] = true;
        dp[0][0] = true;
        
        for(int i = 1; i < nums.length; i++) {
        	for(int j = 0; j < targetSum + 1; j++) {
        		
        		if (j - nums[i] >= 0) {
        			dp[i][j] = dp[i-1][j - nums[i]] || dp[i-1][j];
        		} else {
        			dp[i][j] = dp[i-1][j] ;	
        		}
        	}
      
        }
        return dp[nums.length-1][targetSum];
    }
    
}
