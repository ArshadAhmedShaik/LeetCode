class Solution {
    public int[] minOperations(String boxes) {
          int n = boxes.length();
          char[] box = boxes.toCharArray();
          int[] left = new int[n];
          int[] right = new int[n];
          int countL = 0;
          left[0] = 0;
          for(int i = 1;i < n;i++) {
                if(box[i-1]=='1') countL++;
                left[i] = left[i-1] + countL;
          }
          right[n-1] = 0;
          int countR = 0;
          for(int i = n-2;i >= 0;i--) {
                if(box[i+1]=='1') countR++;
                right[i] = right[i+1] + countR;
          }

          int[] ans = new int[n];
          for(int i = 0;i < n;i++) {
                ans[i] = left[i] + right[i];
          }

          return ans;

    }
}