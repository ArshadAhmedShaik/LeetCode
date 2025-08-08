class Solution {
    public int maxScore(String s) {
        int maxScore = -1;
        int score = 0;
        int start = 0;
        for(int i = 0;i <= s.length()-2;i++) {
                // count number of zeroes from start to i
                int zeroCount = 0;
                for(int j = start;j <= i;j++) {
                        if(s.charAt(j)=='0') zeroCount++;
                }
                // count number of ones from i+1 to s.length()-1
                int onesCount = 0;
                for(int j = i + 1;j < s.length();j++) {
                        if(s.charAt(j)=='1') onesCount++; 
                }

                score = zeroCount + onesCount;
                maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}