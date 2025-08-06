class Solution {
    public int specialArray(int[] nums) {
       int[] count = new int[nums.length+1];
       for(var x: nums) {
            if(x>=nums.length) count[nums.length]++;
            else count[x]++;
       }
       int sum = 0;
       for(int i = count.length-1;i>=0;i--) {
            sum += count[i];
            if(sum==i) return i; 
       }

       return -1;

    }
}