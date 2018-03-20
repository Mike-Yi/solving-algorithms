package difficulty.medium;

public class Maximal_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int maximalSquare(char[][] matrix) {
        
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] dp = new int[row+1][col+1];
        int maxCount = 0;
        
        for(int i = 0; i < row ; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == '1') {
                    dp[i+1][j+1] = Math.min(Math.min( dp[i][j+1], dp[i+1][j] ), dp[i][j] ) + 1; 
                    maxCount = Math.max(maxCount , dp[i+1][j+1]);
                }
            }
        }
        
        return maxCount * maxCount;
    }
}
