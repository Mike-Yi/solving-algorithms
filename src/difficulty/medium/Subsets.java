package difficulty.medium;

import java.util.LinkedList;
import java.util.List;



public class Subsets {

	public static void main(String[] args) {
		Subsets s = new Subsets();
		int[] nums = new int[]{1,2,3};
		s.subsets(nums);

	}
	
    public List<List<Integer>> subsets(int[] nums) {
    	
    	List<List<Integer>> lists = new LinkedList<>();
    	List<Integer> list = new LinkedList<>();
    	subsets(lists, list, nums, 0);
    	
    	
    	return lists;
    }
    
    public void subsets(List<List<Integer>> lists, List<Integer> list, int[] nums, int start) {
    	lists.add(new LinkedList<>(list));
    	for(int i = start; i < nums.length; i++) {
    		list.add(nums[i]);
    		subsets(lists, list, nums, i+1);
    		list.remove(list.size()-1);
    	}
    	
    }

}
