package difficulty.medium;

public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimum_Size_Subarray_Sum s = new Minimum_Size_Subarray_Sum();
		

		
		s.minSubArrayLen(11, new int[]{1,2,3,4,5});
	}
	
    public int minSubArrayLen(int s, int[] nums) {
        
        int count = Integer.MAX_VALUE;
        int totalSum = 0;
        int i = 0;
        int j = 0;
        
        while(j < nums.length) {
            totalSum += nums[j];
            
            while(totalSum > s) {
                totalSum -= nums[i++];
            }
            
            if(totalSum == s) {
                count = Math.min(count , j - i + 1);
            }
            
            j++;
        }
        return (count == Integer.MAX_VALUE) ? 0 : count;
    }

}
