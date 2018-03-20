package difficulty.medium;

import java.util.HashSet;

public class Word_Search {

	public static void main(String[] args) {
		char[][] board = new char[][] {
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}		
		};
		
		Word_Search s = new Word_Search();
		s.exist(board, "CBA");
	}
	
    public boolean exist(char[][] board, String word) {
    	boolean[][] visited = new boolean[board.length][board[0].length];
        for(int row = 0; row < board.length; row++) {
        	for(int col = 0; col < board.length; col++) {
        		if(board[row][col] == word.charAt(0)) {       
        			if(exist(board, visited ,word, 0, row, col)) return true;
        		}
        	}
        }
    	
    	return false;
    }
    
    public boolean exist(char[][] board, boolean[][] visited ,String word,int p, int i, int j) {
    	if(word.length() == p) return true;
    	if(board.length <= i || board[0].length <= j || i < 0 || j < 0) return false;
    	boolean one = false;
    	boolean two = false;
    	boolean three = false;
    	boolean four = false;
    	if(board[i+1][j] == word.charAt(p) && visited[i+1][j] != true) {
    		visited[i+1][j] = true;
    		one = exist(board, visited ,word, p+1,i+1, j);
    		visited[i+1][j] = false;
    	}
    	if(board[i][j+1] == word.charAt(p) && visited[i][j+1] != true) {
    		visited[i][j+1] = true;
    		two =exist(board, visited ,word, p+1,i, j+1);
    		visited[i][j+1] = false;
    	}
    	if(board[i-1][j] == word.charAt(p) && visited[i-1][j] != true) {
    		visited[i-1][j] = true;
    		three = exist(board, visited ,word, p+1,i-1, j);
    		visited[i-1][j] = false;
    	}
    	if(board[i][j-1] == word.charAt(p) && visited[i][j-1] != true) {
    		visited[i][j-1] = true;
    		four = exist(board, visited ,word, p+1,i, j-1);
    		visited[i][j-1] = false;
    	}
  
    	return one || two || three || four;
    }
    

}
