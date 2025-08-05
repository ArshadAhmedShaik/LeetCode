class Solution {
     static{
        for(int i=0;i<500;i++)
         majorityElement(new int[]{0});
    }
    public static int majorityElement(int[] nums) {

      int res = 0;
      int count = 0;

      for(var x: nums) {
        if(count == 0) res = x; 
            if(x!=res) count--;
            else count++;
           
      }

      return res;
   
    }
}