class Solution {
    public static int[] minOperations(String boxes) {
          int n = boxes.length();
          int[] ans = new int[n];
          int count = 0;
          ans[0] = 0;
          for(int i = 1;i < n;i++) {
                if(boxes.charAt(i-1)=='1') count++;
                ans[i] = ans[i-1] + count;
          }
          int right = 0;
          count = 0;
          for(int i = n-2;i >= 0;i--) {
                if(boxes.charAt(i+1)=='1') count++;
                right += count;
                ans[i] += right; 
          }

          return ans;

    }
}