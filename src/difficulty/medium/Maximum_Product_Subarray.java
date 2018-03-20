package difficulty.medium;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum_Product_Subarray s = new Maximum_Product_Subarray();
		s.maxProduct(new int[] {2,3,-2,4,2,-1,2,-1});
	}
	
    public int maxProduct(int[] nums) {

        int[] minuseNums = new int[nums.length+1];
        int[] plusNums = new int[nums.length+1];
        int max = Integer.MIN_VALUE;
        
        minuseNums[0] = 1;
        plusNums[0] = 1;
        
        for(int i = 0; i < nums.length; i++) {
            
            minuseNums[i+1] = Math.min(nums[i] * minuseNums[i], nums[i] * plusNums[i]);
            plusNums[i+1] = Math.max(nums[i] * minuseNums[i], nums[i] * plusNums[i]);
            max = Math.max(max,plusNums[i+1]);
            if(plusNums[i+1] < 1) plusNums[i+1] = 1;
           
        }
        
        return max;
    }
}
