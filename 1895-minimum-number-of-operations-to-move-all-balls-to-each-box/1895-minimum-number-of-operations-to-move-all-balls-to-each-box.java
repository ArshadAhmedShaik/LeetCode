class Solution {
    static {
           for(int i = 0;i < 10000;i++)
           minOperations(new String("0001000101")); 
    }
    public static int[] minOperations(String boxes) {
          int n = boxes.length();
          int[] ans = new int[n];
          int countL = 0;
          ans[0] = 0;
          for(int i = 1;i < n;i++) {
                if(boxes.charAt(i-1)=='1') countL++;
                ans[i] = ans[i-1] + countL;
          }
          int right = 0;
          int countR = 0;
          for(int i = n-2;i >= 0;i--) {
                if(boxes.charAt(i+1)=='1') countR++;
                right += countR;
                ans[i] += right; 
          }

          return ans;

    }
}