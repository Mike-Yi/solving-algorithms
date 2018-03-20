package difficulty.medium;

public class Unique_Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unique_Binary_Search_Tree s = new Unique_Binary_Search_Tree();
		s.numTrees(4);
	}
	
	public int numTrees(int n) {
        
        if(n < 3) {
			if (n < 1) {
                return 0;
            }
            if (n < 2) {
                return 1;
            }
            if (n < 3) {
                return 2;
            }
		}
        
        
		int[] total = new int[n+1];      
        total[0] = 1;
		total[1] = 1;
		total[2] = 2;
		
		for(int i = 3; i < n+1; i++) {
			int sum = 0;
			for(int j = 1; j < i+1; j++) {
				
				int curr = total[j-1] * total [i-j];
				sum += curr;
			}
			
			total[i] = sum;
		}
		
		return total[n];
	}

}
