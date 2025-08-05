class Solution {
    public int majorityElement(int[] nums) {

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