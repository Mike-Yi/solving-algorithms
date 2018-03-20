package difficulty.medium;

import java.util.Arrays;
import java.util.Collections;

public class Maximum_Length_of_Pair_Chain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (p1, p2) -> (p1[0] != p2[0]) ? p1[0] - p2[0] : p1[1] - p2[1]);
        
        int maxChain = 1;
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for(int i = 1; i < pairs.length; i++) {
            for(int j = 0; j < i ; j++){
                if(pairs[i][0] > pairs[j][1]){
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
                maxChain = Math.max(maxChain, dp[i]);
            }
        }
            
        return maxChain;
    }
}
