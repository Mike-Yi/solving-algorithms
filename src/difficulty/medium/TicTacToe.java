package difficulty.medium;

class TicTacToe {
	int[] row;
	int[] col;
	int leftDiameter;
	int rightDiameter;
	int n;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        row = new int[n];
        col = new int[n];
        leftDiameter = 0;
        rightDiameter = 0;
        this.n = n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int r, int c, int player) {
        row[r] += (player == 1) ? 1 : -1; 
        col[c] += (player == 1) ? 1 : -1;
        if(r == c) {
        	leftDiameter += (player == 1) ? 1 : -1; 
        }
        
        if(r + c == n-1) {
        	rightDiameter += (player == 1) ? 1 : -1; 
        }
        
        if(row[r] == n || col[c] == n ||  leftDiameter == n || rightDiameter == n) {
        	return 1;
        }
        
        if(row[r] == -n || col[c] == -n || rightDiameter == -n || leftDiameter == -n) {
        	return 2;
        }
        
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
