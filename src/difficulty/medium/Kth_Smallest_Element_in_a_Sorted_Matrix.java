package difficulty.medium;

import java.util.PriorityQueue;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {
			   { 1,  5,  9},
			   {10, 11, 14},
			   {12, 13, 15}
		};
		
		Kth_Smallest_Element_in_a_Sorted_Matrix s= new Kth_Smallest_Element_in_a_Sorted_Matrix();
		s.kthSmallest(matrix, 8);
		
	}
	

    public int kthSmallest(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0,  j = matrix[0].length - 1;
             for(int i = 0; i < matrix.length; i++) {
         
                while(j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                
                count += (j + 1);
            }
            if(count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

class Tuple {
    int row, col, val;
    public Tuple (int x, int y, int val) {
        this.row = x;
        this.col = y;
        this.val = val;
    }
}
