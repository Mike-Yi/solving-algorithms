package difficulty.medium;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_Colors s = new Sort_Colors();
		s.sortColors(new int[]{0,0,2,1,0,1});
	}
	
    public void sortColors(int[] nums) {
        int back = nums.length-1;
        int start = 0;
        
        for(int i = 0; i <= back; i++){
            if(nums[i] != 1) {
            	if(nums[i] == 0){
                    swap(nums,i , start);
                    start++;
                }  
                if(nums[i] == 2) {
                    swap(nums,i,back);
                    back--;
                    i--;
                } 
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
