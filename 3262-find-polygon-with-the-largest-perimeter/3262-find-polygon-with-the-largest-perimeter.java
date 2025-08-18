class Solution {
    public long largestPerimeter(int[] nums) {
          int n = nums.length;
          Arrays.sort(nums);
          long[] prefix = new long[n];
          long temp = 0;
          for(int i = 0;i < n;i++) {
                temp += nums[i];
                prefix[i] = temp;
          }

          for(int i = n - 1;i >= 2;i--) {
               
                        if(prefix[i-1]>nums[i]) {
                            return prefix[i-1]+nums[i];
                        } 
          
          }

          return -1;
    }
}