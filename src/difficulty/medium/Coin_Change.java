package difficulty.medium;

import java.util.Arrays;

public class Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin_Change s = new Coin_Change();
		s.coinChange(new int[]{2}, 1);
	}
	
    public int coinChange(int[] coins, int amount)  {
    
	    if(amount == 0) return 0;
	    int[] dp = new int[amount+1];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	    dp[0] = 0;
	    
	    for(int sum = 1; sum < amount+1 ; sum++) {
	    	for(int coin : coins) {
	    		if(sum - coin > -1) {
	    			dp[sum] = Math.min(  (dp[sum - coin] == Integer.MAX_VALUE) ? Integer.MAX_VALUE :  dp[sum - coin] + 1, dp[sum]);
	    		}
	    	}
	    }
	    return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
	}

}
