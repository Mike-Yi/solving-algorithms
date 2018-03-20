package difficulty.medium;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		
		Palindromic_Substrings s =new Palindromic_Substrings();
		s.countSubstrings("aaa");
	}
	
    public int countSubstrings(String s) {
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        
        for(int i = s.length()-1 ; i >= 0; i--) {
            for(int j = i; j <s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && (i+1 >= j-1 || dp[i+1][j-1] ) ) {
                    dp[i][j] = true;
                    count++;
                } else {
                    dp[i][j] = false;
                }
                
            }
        }   
        
        return count;
    }

}
