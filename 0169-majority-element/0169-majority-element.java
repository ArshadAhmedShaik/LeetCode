class Solution {
    
    public static int majorityElement(int[] nums) {
        
      int majorityElement = -1;
      int n = nums.length;
      int count = 0;

      for(int i = 0;i < n;i++) {
            if(count == 0) {
                majorityElement = nums[i];
                count++;
            } else {
                if(nums[i]==majorityElement) {
                        count++;
                } else {
                    count--;
                }
            }      
      }

      return majorityElement;
     
    }
}