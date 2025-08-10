class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            if(nums[i]!=0) {
                nums[index++] = nums[i];
            }
        }
        Arrays.fill(nums, index, nums.length, 0);
    }
}