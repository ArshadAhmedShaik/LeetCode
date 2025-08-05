class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        int n = nums.length;
        for(int i = 0;i <= n - 2;i++) {
            if(nums[i]>nums[i+1]) {
                inc = false;
                break;
            }
        }
        for(int i = 0;i <= n - 2;i++) {
            if(nums[i]<nums[i+1]) {
                dec = false;
                break;
            }
        }
        return inc||dec;
    }
}