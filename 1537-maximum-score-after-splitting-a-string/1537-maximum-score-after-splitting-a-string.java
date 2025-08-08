class Solution {
    public int maxScore(String s) {
        int[] zeros = new int[s.length()];
        int[] ones = new int[s.length()];
        if(s.charAt(0)=='0') {
                zeros[0] = 1;
                ones[0] = 0;
        } else {
              zeros[0] = 0;
              ones[0] = 1;
        }
        for(int i = 1;i < zeros.length;i++) {
                if(s.charAt(i)=='0') {
                zeros[i] = zeros[i-1] + 1;
                ones[i] = ones[i-1];
                } else {
                    ones[i] = ones[i-1] + 1;
                    zeros[i] = zeros[i-1];
                }
         }
         int maxScore = -1;
         int score = 0;   
         for(int i = 0;i < s.length()-1;i++) {
                score = zeros[i] + ones[s.length()-1] - ones[i];
                maxScore = Math.max(score, maxScore);
         }
         return maxScore;
    }
}