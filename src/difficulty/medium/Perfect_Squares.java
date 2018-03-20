package difficulty.medium;

public class Perfect_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        
        for(int i = 1; i < dp.length; i++) {
            dp[i] = i;
        }
        
        for(int i = 2; i * i < dp.length ; i++) {
            for(int j = 1; j < dp.length; j++) {
                dp[j] = (j >= i * i) ? Math.min(dp[j - i * i] + 1, dp[j]) : dp[j];
            }
        }
        
        return dp[n];
    }

}
