class Solution {
    public static int[] minOperations(String boxes) {
         
         int n = boxes.length();
         int[] ans = new int[n];
         int left = 0;
         int count = 0;

         for(int i = 0;i < n;i++) {
                if(boxes.charAt(i)=='1') count++;
                ans[i] = left;
                left += count;
         }

         int right = 0;
         count = 0;

         for(int i = n - 1;i >= 0;i--) {
                if(boxes.charAt(i)=='1') count++;
                ans[i] += right;
                right += count;
         }

         return ans;

    }
}