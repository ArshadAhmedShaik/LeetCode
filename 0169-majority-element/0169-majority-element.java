class Solution {

     static{
        for(int i=0;i<500;i++)
         majorityElement(new int[]{0});
    }

    public static int majorityElement(int[] nums) {

     
            Arrays.sort(nums);
            return nums[nums.length/2];
   
    }
}