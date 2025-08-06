class Solution {

   
    public static int majorityElement(int[] nums) {

     
     int count = 0;
     int res = -1;

     for(var x: nums) {
            if(count==0) res = x;
            if(x==res) count++;
            else {
                count--;
            }
     }

      return res;      
   
    }
}