package difficulty.easy;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0;i < s.length(); i++){
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if(set.contains(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        
        return true;
    }

}
