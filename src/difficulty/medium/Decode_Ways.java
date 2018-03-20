package difficulty.medium;

public class Decode_Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decode_Ways s = new Decode_Ways();
		s.numDecodings("110");
	}
	
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length()+1];
        if(s.length() == 0 ||s.charAt(0) == '0') return 0;
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i < dp.length; i++) {
            int twoNum = Integer.valueOf(s.substring(i-2, i));
            if(s.charAt(i-1) == '0') {
                if(twoNum > 26 || twoNum == 0) return 0;
                dp[i] = dp[i-2];
            } else {
                if(twoNum <= 26 && s.charAt(i-2) != '0'){
                    dp[i] = dp[i-1] + dp[i-2];  
                } else {
                    dp[i] = dp[i-1];
                } 
            }
        }
        
        return dp[s.length()];
        
    }

}
