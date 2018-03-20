package difficulty.medium;

public class Combination_Sum_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination_Sum_IV s = new Combination_Sum_IV();
		s.combinationSum4(new int[]{1,2,3}, 4);
	}
	
    public int combinationSum4(int[] nums, int target) {
        int totalcount = 0;
        if(target == 0) {
            return 1;
        } else if(target > 0) {
            for(int i = 0; i < nums.length; i++) {
                totalcount += combinationSum4(nums, target - nums[i]);
            }
            return totalcount;
        } else {
            return 0;
        }	
    }
    
}
