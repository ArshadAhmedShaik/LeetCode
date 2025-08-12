class Solution {
    public static int[] productExceptSelf(int[] nums) {

               int n = nums.length;
               int[] ans = new int[n];
               int p = 1;
               int count = 0;
               
               for(int x: nums) {
                    if(x!=0)
                    p *= x;
                    else count++;
               }

               
                for(int i = 0;i < n;i++) {
                    if(nums[i]!=0) {
                        if(count>0) ans[i] = 0;
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