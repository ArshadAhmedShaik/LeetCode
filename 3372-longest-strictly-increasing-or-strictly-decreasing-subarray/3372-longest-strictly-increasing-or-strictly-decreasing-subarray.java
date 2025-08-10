class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // strictly increasing
        int maxIncrease = 1;
        int increase = 1;
        for(int i = 1;i < nums.length;i++) {
                if(nums[i]<=nums[i-1]) {
                     increase = 1;
                } else {
                    increase += 1;
                }
                maxIncrease = Math.max(increase, maxIncrease);
        }

        // strictly decreasing
        int maxDecrease = 1;
        int decrease = 1;
        for(int i = 1;i < nums.length;i++) {
                if(nums[i]>=nums[i-1]) {
                    decrease = 1;
                } else {
                    decrease += 1;
                }
                maxDecrease = Math.max(decrease, maxDecrease);
        }
        return Math.max(maxIncrease, maxDecrease);
    }
}