package difficulty.medium;

import java.util.HashSet;
import java.util.List;

public class word_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> set = new HashSet<>();
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        
        for(String c : wordDict) {
            set.add(c);
        }
       
        for(int i = 0; i < s.length(); i++){
            if(res[i]) {
                for(int j = i+1; j <= s.length(); j++){
                    if(set.contains(s.substring(i,j))){
                        res[j] = true;
                    }
                }
            }
        }
        
        return res[s.length()];
    }

}
