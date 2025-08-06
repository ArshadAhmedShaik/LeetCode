class Solution {
    public int specialArray(int[] nums) {
        // Brute force
        int n = nums.length;
        for(int i = 1;i <= n;i++) {
            int number = 0;
            for(int j = 0;j < n;j++) {
                    if(nums[j]>=i) number++;
            }
            if(number==i) return number;
        }
        return -1;
    }
}