package difficulty.medium;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Next_Permutation s = new Next_Permutation();
		s.nextPermutation(new int[]{1,1});
	}
	
    public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        while(i != 0 && nums[i-1] >= nums[i]){
            i--;
        }
        if(i == 0) {
            reverse(nums, 0, nums.length-1);
        } else {
            int a = nums.length-1;
            while(nums[a] <= nums[i-1]){
                a--;
            }
            swap(nums, a, i-1);
            reverse(nums, i, nums.length-1);
        }
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }  
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
