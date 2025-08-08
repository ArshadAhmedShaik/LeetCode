class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for(var x: s.toCharArray()) {
               if(x=='1') totalOnes++;
        }
        int leftZeros = 0;
        int leftOnes = 0;
        int score = 0;
        int maxScore = -1;
        for(int i = 0;i <= s.length()-2;i++) {
                if(s.charAt(i)=='0') {
                    leftZeros++;
                } else {
                    leftOnes++;
                }
            score = leftZeros + (totalOnes - leftOnes);
            maxScore = Math.max(score, maxScore);
        }

        return maxScore;
    }
}