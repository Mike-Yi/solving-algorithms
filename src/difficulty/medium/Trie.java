package difficulty.medium;

import java.util.HashMap;

public class Trie {
	
	class node{
		HashMap<Character, node> map;
		char c;
		boolean end;
		node(char c) {
			this.c = c;
			map = new HashMap<>();
			this. end = false;
		}
	}
	private node head;
    /** Initialize your data structure here. */
    public Trie() {
    	head = new node('0');
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	node temp = head;
    	for(char c : word.toCharArray()) {
    		if(temp.map.containsKey(c)) {
    			temp = temp.map.get(c);
    		} else {
    			node n = new node(c);
    			temp.map.put(c , n);
    			temp = n;
    		}
    	}
    	temp.end = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	node temp = head;
        for(int i = 0; i < word.length(); i++) {
        	if(temp.map.containsKey(word.charAt(i))) {
        		temp = temp.map.get(word.charAt(i));
        	} else {
        		return false;
        	}
        }
    	return temp.end;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	node temp = head;
        for(int i = 0; i < prefix.length(); i++) {
        	if(temp.map.containsKey(prefix.charAt(i))) {
        		temp = temp.map.get(prefix.charAt(i));
        	} else {
        		return false;
        	}
        }
    	return true;
    }
}

