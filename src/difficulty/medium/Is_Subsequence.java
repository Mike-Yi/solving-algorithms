package difficulty.medium;

public class Is_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isSubsequence(String s, String t) {
        
        int pointerS = 0;
        int pointerT = 0;
        
        while(pointerS < s.length() && pointerT < t.length()) {
        
            if(s.charAt(pointerS) == t.charAt(pointerT)){
                pointerS++;
                pointerT++;
            } else {
                pointerT++;
            }
        }
        
        return pointerS == s.length();
    }

}
