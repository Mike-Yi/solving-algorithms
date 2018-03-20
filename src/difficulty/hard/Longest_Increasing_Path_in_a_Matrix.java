package difficulty.hard;

public class Longest_Increasing_Path_in_a_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Increasing_Path_in_a_Matrix s = new Longest_Increasing_Path_in_a_Matrix();
		s.longestIncreasingPath( new int[][] {
			
			{7,7,5},
			{2,4,6},
			{8,2,0}
			
			
			
		});
		
		
	}
	
    public int longestIncreasingPath(int[][] matrix) {
    	
    	if(matrix.length == 0 || matrix[0].length == 0) return 0;
    	
        int maxNum = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
            	
                maxNum = Math.max(maxCount(matrix,  dp, i,  j, Integer.MIN_VALUE), maxNum);
            }
        }
        
        return maxNum;
            
    }
    
    public int maxCount(int[][] matrix, int[][] dp, int i,  int j, int num){
        
        if(i < 0 || j < 0 | i >= matrix.length || j >= matrix[0].length){
            return 0;
        }
        if(matrix[i][j] <= num) {
            return 0;
        } 
        
        if(dp[i][j] != 0) {
        	return dp[i][j];
        }
        
        int leftCount = maxCount(matrix,  dp, i,  j-1, matrix[i][j]);
        int rightCount = maxCount(matrix,  dp, i,  j+1, matrix[i][j]);
        int topCount = maxCount(matrix,  dp, i-1,  j, matrix[i][j]);
        int botCount = maxCount(matrix,  dp, i+1,  j, matrix[i][j]);
        int max = Math.max( Math.max(leftCount, rightCount), Math.max(topCount, botCount)) + 1;
        
        dp[i][j] = max;
        return dp[i][j];
        
    }

}
