class Solution {

     static{
        for(int i=0;i<500;i++)
         majorityElement(new int[]{0});
    }

    public static int majorityElement(int[] nums) {

     
            int element = -1;
            int count = 0;

            for(var x: nums) {
                if(count==0) element = x;
                if(x==element) count++;
                else count--;
            }

            return element;
   
    }
}