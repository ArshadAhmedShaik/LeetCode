class Solution {
    public static int[] productExceptSelf(int[] nums) {
                int n = nums.length;
                int[] dp = new int[n];
                int left = 1;
                for(int i = 0;i < n;i++) {
                        dp[i] = left;
                        left *= nums[i];
                }
                int right = 1;
                for(int i = n - 1;i >= 0;i--) {
                        dp[i] *= right;
                        right *= nums[i];
                }

                return dp;

    }
}