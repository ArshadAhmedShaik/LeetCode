class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int maxLength = 1;
        int increase = 1;
        int decrease = 1;

        for(int i = 1;i < nums.length;i++) {
                if(nums[i]<=nums[i-1]) {
                     increase = 1;
                } else{
                    increase += 1;
                }
                 if(nums[i]>=nums[i-1]) {
                    decrease = 1;
                } else {
                    decrease += 1;
                }

                maxLength = Math.max(maxLength, Math.max(increase, decrease));
        }

        return maxLength;
    }
}