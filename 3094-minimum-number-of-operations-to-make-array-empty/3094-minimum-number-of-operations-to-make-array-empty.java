class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int i = 0;

        while (i < n) {
            int count = 1;
   
            while (i + count < n && nums[i + count] == nums[i]) {
                count++;
            }

            if (count == 1) return -1;

            if (count % 3 == 0) {
                ans += count / 3;
            } else if (count % 3 == 1) {
                ans += (count - 4) / 3 + 2; 
            } else { 
                ans += count / 3 + 1;
            }

            i += count; 
        }
        return ans;
    }
}