class Solution {
    
    public static int majorityElement(int[] nums) {

       int majority = Integer.MIN_VALUE;
       int count = 0;
       int n = nums.length;

       for(int i = 0;i < n;i++) {
            if(count==0) {
               majority = nums[i];
               count++;
            } else if(nums[i]==majority) {
                    count++;
            } else {
                count--;
            }
       }

       return majority;

    }
}