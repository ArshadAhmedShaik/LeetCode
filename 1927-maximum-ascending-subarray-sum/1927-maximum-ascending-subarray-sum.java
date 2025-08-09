class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        for(int i = 0;i < nums.length;i++) {
            int sum = nums[i];
            for(int j = i + 1;j < nums.length;j++) {
                    if(nums[j]<=nums[j-1]) {
                        break;
                    } else {
                        sum += nums[j];
                    }
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}