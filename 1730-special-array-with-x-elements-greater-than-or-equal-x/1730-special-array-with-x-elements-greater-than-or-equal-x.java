class Solution {
    public int specialArray(int[] nums) {
      int n = nums.length;
      int[] count = new int[n+1];

      for(var x: nums) {
            if(x>=n) count[n]++;
            else count[x]++;
      }

      int sum = 0;
      for(int i = n;i >= 0;i--) {
            sum += count[i];
            if(sum==i) return i;
      }
      return -1;

    }
}