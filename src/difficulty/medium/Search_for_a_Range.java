package difficulty.medium;

public class Search_for_a_Range {

	public static void main(String[] args) {
		int[] t = new int[]{2,2};
		Search_for_a_Range s = new Search_for_a_Range();
		s.searchRange(t, 3);
		
	}
	
    public int[] searchRange(int[] nums, int target) {
        
        
        int left = searchBeginRange(nums, target, 0, nums.length);
        int right = searchEndRange(nums, target, 0, nums.length)-1;
        
        return (left < nums.length && right > -1 && nums[left] == target && nums[right] == target) ? new int[]{left, right} : new int[]{-1,-1};
        
    }
    
    public int searchBeginRange(int[] nums, int target, int lo, int hi) {
        
        if(lo == hi) return hi;
        
        int mid  = (lo + hi) / 2;
        if(nums[mid] >= target) {
            hi = mid;
        } else {
            lo = mid + 1;
        }
        
        return searchBeginRange(nums, target, lo, hi);
    }
    
    public int searchEndRange(int[] nums, int target, int lo, int hi) {
        
        if(lo == hi) return hi;
        
        int mid  = (lo + hi) / 2;
        if(nums[mid] <= target) {
            lo = mid+1;
        } else {
            hi = mid;
        }
        
        return searchEndRange(nums, target, lo, hi);
    }

}
