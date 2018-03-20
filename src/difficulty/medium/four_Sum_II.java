package difficulty.medium;

import java.util.HashMap;

public class four_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	int count = 0;
    	HashMap<Integer , Integer> map = new HashMap<>();
    	for(int i = 0; i < A.length; i++) {
    		for(int j = 0; j < B.length; j++) {
    			int num = A[i] + B[j];
    			map.put(num, map.getOrDefault(num, 0)+1);
    		}
    	}
    	
    	for(int i = 0; i < C.length; i++) {
    		for(int j = 0; j < D.length; j++) {
    			int num = -(C[i]+D[j]);
    			if(map.containsKey(num)) {
    				count += map.get(num);
    			}
    		}
    	}
	
    	return count;
    }

}
