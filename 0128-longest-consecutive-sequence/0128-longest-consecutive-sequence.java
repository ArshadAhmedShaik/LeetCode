class Solution {
    public int longestConsecutive(int[] nums) {
           if(nums.length==0) return 0;
           Arrays.sort(nums);
           int n = nums.length;
           int longest = 1;
           int count = 1;
           for(int i = 1;i < n;i++) {
                if(nums[i]==nums[i-1]+1) {
                        count++;
                        longest = Math.max(longest, count);
                } else if(nums[i]==nums[i-1]) {
                    
                } else {
                    count = 1;
                }
           }

           return longest;
    }
}