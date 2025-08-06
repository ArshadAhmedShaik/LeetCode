class Solution {
    public int specialArray(int[] nums) {
       int[] count = new int[nums.length+1];
       for(var x: nums) {
            if(x>=nums.length) count[nums.length]++;
            else count[x]++;
       }

       for(int i = count.length - 2;i>=0;i--) {
                count[i] += count[i+1];
       }

       for(int i = 0;i < count.length;i++) {
                if(count[i]==i) return i;
       }

       return -1;

    }
}