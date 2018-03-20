package difficulty.medium;

public class Longest_Palindromic_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Palindromic_Subsequence s = new Longest_Palindromic_Subsequence();
		s.longestPalindromeSubseq("bbbab");
	}
	
    public int longestPalindromeSubseq(String s) {
        
        int[][] dp = new int[s.length()][s.length()];
        
        for(int i = s.length()-1; i >= 0; i--) {
            for(int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(i == j) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i+1][j-1] + 2;    
                    }
                } else {
                    dp[i][j] = Math.max( dp[i+1][j] , dp[i][j-1] ); 
                }
            }
        }
        
        return dp[0][s.length()-1];
    }
}
