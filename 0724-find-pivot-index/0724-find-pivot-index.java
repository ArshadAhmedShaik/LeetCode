class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        leftSum[0] = nums[0];
        int sum = nums[0];
        for(int i = 1;i < nums.length;i++) {
                leftSum[i] = leftSum[i-1] + nums[i];
                sum += nums[i];
        }

        for(int i = 0;i < nums.length;i++) {
            int ls = 0;
            if(i==0) {
                ls = 0;
            } else {
            ls = leftSum[i-1];
            }
            if(ls==sum-leftSum[i]) {
                    return i;
            }
        }

        return -1;
        
    }
}