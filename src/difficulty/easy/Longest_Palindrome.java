package difficulty.easy;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }
        
        boolean checkOne = false;
        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            
            if(entry.getValue() % 2 != 0) {
                count -= 1;
                checkOne = true;
            }
            count += entry.getValue();
        }
        
        return (checkOne) ? count + 1 : count;
    }

}
