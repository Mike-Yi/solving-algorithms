package difficulty.easy;

public class Non_decreasing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_decreasing_Array s = new Non_decreasing_Array();
		s.checkPossibility(new int[] {4,2,3});
	}
	
    public boolean checkPossibility(int[] nums) {
        boolean check = false;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] >= nums[i]) {
                if(check) {
                    return false;
                } else {
                    check = true;
                    nums[i] = nums[i-1] + 1;
                } 
            }
        }
        
        return true;
    }

}
