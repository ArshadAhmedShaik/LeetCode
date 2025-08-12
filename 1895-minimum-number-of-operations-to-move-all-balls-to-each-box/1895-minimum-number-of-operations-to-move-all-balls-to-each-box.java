class Solution {
    public int[] minOperations(String boxes) {
          int n = boxes.length();
          char[] box = boxes.toCharArray();
          int[] ans = new int[n];
          int countL = 0;
          ans[0] = 0;
          for(int i = 1;i < n;i++) {
                if(box[i-1]=='1') countL++;
                ans[i] = ans[i-1] + countL;
          }
          int right = 0;
          int countR = 0;
          for(int i = n-2;i >= 0;i--) {
                if(box[i+1]=='1') countR++;
                ans[i] += right + countR;
                right += countR;
          }

          return ans;

    }
}