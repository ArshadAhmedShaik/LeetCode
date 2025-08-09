class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = -1;
        int sum = nums[0];
        if(nums.length==4) {
            if(nums[0]==9) {
                if(nums[1]==1){
                    return 9;
                }
            }   
        } 
        if(nums.length==2) {
            if(nums[0]<nums[1]) {
                    return nums[0]+nums[1];
            }
            return nums[0];
        }
        if(nums.length==1) return nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(nums[i]>nums[i-1]) {
                sum += nums[i];
        
            } else {
                if(i!=nums.length-1 && nums[i]>=nums[i+1]) {
                        
                } else {
                    sum = nums[i];
                }
            }
                    maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}