package difficulty.medium;

public class Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target_Sum s = new Target_Sum();
		s.findTargetSumWays(new int[] {0,0,0,0,0,0,0,0,1}, 1);
	}
	
    public int findTargetSumWays(int[] nums, int S) {
    	int maxSum = 1000;

    	int col = maxSum*2+1;
    	int[][] dp = new int[nums.length][col];
    	dp[0][maxSum - nums[0]] += 1;
    	dp[0][maxSum + nums[0]] += 1;
    	
    	for(int i = 0; i < nums.length-1; i++) {
    		for(int j = 0; j < col; j++) {
    			if(dp[i][j] != 0) {
    				dp[i+1][j - nums[i+1]] += dp[i][j] ;
    				dp[i+1][j + nums[i+1]] += dp[i][j] ;
    			}
    		}
    	}
    	
    	
    	return (S > maxSum)? 0  : dp[nums.length-1][maxSum + S];	
    }

}
