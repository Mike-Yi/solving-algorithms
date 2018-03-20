package difficulty.medium;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Increasing_Subsequence s = new Longest_Increasing_Subsequence();
		s.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18, 4, 19});
	}
	
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

}
