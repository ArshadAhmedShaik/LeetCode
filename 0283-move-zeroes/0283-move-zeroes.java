class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        int n = nums.length;
        while(i<n) {
                if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
                }
                i++;
        }

    }
}