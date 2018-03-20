package difficulty.medium;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        
        int row = grid.length-1;
        int col = grid[0].length-1;
        
        for(int z = row-1; z >= 0; z--){
            grid[z][col] += grid[z+1][col];
        }
        
        for(int z = col-1; z >= 0; z--){
            grid[row][z] += grid[row][z+1];
        }
        
        
        for(int i = row-1; i >= 0; i--) {
            for(int j = col-1; j >= 0; j--) {
                grid[i][j] += Math.min(grid[i+1][j] , grid[i][j+1]);
            }
        }
        
        return grid[0][0];
        
    }

}
