package difficulty.medium;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = new int[][] {
			
			//{1,2},{3,4},{5,6},{7,8}
			{10,16},{2,8},{1,6},{7,12}
		};
		
		MinimumNumberofArrowstoBurstBalloons s = new MinimumNumberofArrowstoBurstBalloons();
		s.findMinArrowShots(points);

	}
    public int findMinArrowShots(int[][] points) {
        
        if(points.length == 0) return 0;
        Arrays.sort(points, (p1, p2) -> (p1[0] != p2[0]) ? p1[0] - p2[0] : p1[1] - p2[1] );
        
        int i = 0;
        int count = 1;
        int start = points[0][1];
        int end = 0;
        
        while(i < points.length){
            while(i < points.length && start >= end) {
                end = points[i][0];
                i++;
            }
            start = points[i-1][1];
            count++;
        }
        
        return count;
    }

}
