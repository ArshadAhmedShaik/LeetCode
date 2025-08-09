class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 1;
        int length = 1;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i]<=nums[i-1]) {
                length = 1;
            } else {
                length += 1;
            }
            longest = Math.max(length, longest);
        }
        int longest1 = 1;
        int len = 1;
       for(int i = 1;i<nums.length;i++) {
            if(nums[i]>=nums[i-1]) {
                len = 1;
            } else {
                len += 1;
            }
            longest1 = Math.max(len, longest1);
        }
        return Math.max(longest, longest1);
    }
}