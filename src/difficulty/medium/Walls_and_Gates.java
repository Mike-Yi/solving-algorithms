package difficulty.medium;

public class Walls_and_Gates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INF = 2147483647;
		int[][] a = new int[][] {
			
			
			{INF,-1 , 0 ,INF},
			{INF,INF,INF,-1},
			{INF,-1, INF,-1},
			{ 0 ,-1, INF,INF}
			
		};
		
		Walls_and_Gates s = new Walls_and_Gates();
		s.wallsAndGates(a);
	}
	
	
    public void wallsAndGates(int[][] rooms) {
        
        for(int i =0 ;i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                   if(rooms[i][j] == 0) {
                       helper(rooms, i, j, 0);
                   }
            }
        }
    }
    
    public void helper(int[][] rooms, int i, int j, int count) {

        
        if(i < 0 || j < 0 || i >= rooms.length || j >= rooms[0].length) {
            return;   
        }
        
        if(rooms[i][j] == -1 || rooms[i][j] < count) {
            return;
        }
        
        rooms[i][j] = count;  
        helper(rooms, i+1, j, count+1);
        helper(rooms, i-1, j, count+1);
        helper(rooms, i, j+1, count+1);
        helper(rooms, i, j-1, count+1);
        
    }
}
