package difficulty.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Ladder_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word_Ladder_II s = new Word_Ladder_II();
		List<String> dic = new ArrayList<>();
		dic.add("hot");
		dic.add("dot");
		dic.add("dog");
		dic.add("lot");
		dic.add("log");
		dic.add("cog");
		
		s.findLadders("hit", "cog", dic);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        boolean[] visited = new boolean[wordList.size()];
        findLadders(beginWord, endWord, wordList, lists, list, visited);
        
        int minSize = Integer.MAX_VALUE;
        for(List<String> ans : lists) {
        	minSize = Math.min(ans.size() , minSize);
        }
        
        List<List<String>> res = new ArrayList<>();
        for(List<String> ans : lists) {
        	if(ans.size() == minSize) {
        		res.add(ans);
        	}
        }
        
        return res;
        
    }
    
    public void findLadders(String beginWord, String endWord, List<String> wordList, 
                                         List<List<String>> lists ,List<String> list, boolean[] visited) {
        
        if(list.get(list.size()-1).equals(endWord)) {
            lists.add(new ArrayList<>(list));
        }
        
        for(int i = 0; i < wordList.size(); i++) {
            if( !visited[i] && checkTwoCharSame(list.get(list.size()-1), wordList.get(i))){
                visited[i] = true;
                list.add(wordList.get(i));
                findLadders(beginWord, endWord, wordList, lists, list, visited);
                visited[i] = false;
                list.remove(list.size()-1);
            }            
        }       
    }
    
    
    public boolean checkTwoCharSame(String s, String t){
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) != t.charAt(i)) count++;
        }
        
        return count == 1;
    }
    
    */
}
