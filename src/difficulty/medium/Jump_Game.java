package difficulty.medium;

public class Jump_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean canJump(int[] nums) {
        int maxJump = nums[0];
        
        for(int i = 1; i <= maxJump && i < nums.length; i++){
            maxJump = Math.max(maxJump, i + nums[i]);
        }
        
        return maxJump >= nums.length-1;
    }
}
