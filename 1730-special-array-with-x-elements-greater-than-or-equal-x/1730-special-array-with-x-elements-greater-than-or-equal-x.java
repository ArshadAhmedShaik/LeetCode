class Solution {
    public int specialArray(int[] nums) {
       int n = nums.length;
       Arrays.sort(nums);
       int prev = -1;
       for(int i = 0;i < nums.length;i++) {
                  int greaterOrEqual = n - i;
                if(nums[i]==greaterOrEqual) return nums[i];
                while(i < nums.length-1 && nums[i]==nums[i+1]) i++;
                if(greaterOrEqual > prev && greaterOrEqual < nums[i]) {
                        return greaterOrEqual;
                }
                prev = nums[i];
       }
       return -1;
    }
}