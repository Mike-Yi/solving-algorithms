package difficulty.medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinationSum(res, list, candidates,  target, 0, 0);
        return res;
    }
    
    public void combinationSum(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int sum, int start){
        if(sum == target) {
            res.add(new ArrayList<>(list));
        }
        
        if(sum < target) {
            
            for(int i = start; i < candidates.length; i++){
                list.add(candidates[i]);
                sum += candidates[i];
                combinationSum(res, list, candidates,  target, sum, i);
                list.remove(list.size()-1);
                sum -= candidates[i];
            }
        }
        
    }

}
