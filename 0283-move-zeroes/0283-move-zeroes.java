class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroes = 0;
        int i = 0;
        int n = nums.length;
        while(i<n) {
            if(nums[i]!=0) nums[nonZeroes++] = nums[i]; 
            i++;
        }

        Arrays.fill(nums, nonZeroes, n, 0);

    }
}