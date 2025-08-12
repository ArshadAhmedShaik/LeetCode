class Solution {
    public static int[] productExceptSelf(int[] nums) {

               int n = nums.length;
               int[] ans = new int[n];
               int p = 1;
               for(int x: nums) {
                    if(x!=0)
                    p *= x;
               }

                int count = 0;
                for(int x: nums) {
                        if(x==0) count++;
                } 

               boolean zeroExists = false;
               for(int x: nums) {
                    if(x==0) {
                        zeroExists = true;
                        break;
                    }
               } 
            
               for(int i = 0;i < n;i++) {
                    if(nums[i]!=0) {
                        if(zeroExists) ans[i] = 0;
                        else ans[i] = p/nums[i];
                    } else {
                        if(count>=2) {
                            ans[i] = 0;
                        } else {
                            ans[i] = p;
                        }
                    }
               }

               return ans;
    }
}