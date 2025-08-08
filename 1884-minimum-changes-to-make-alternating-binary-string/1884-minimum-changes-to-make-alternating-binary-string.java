class Solution {
    public int minOperations(String s) {
           char startZero = '0';
           char startOne = '1';
           int count1 = 0;
           int count2 = 0;
           for(char ch: s.toCharArray()) {
                if(ch != startZero) {
                    count1++;
                } else {
                    count2++;
                }
                startZero = (char)('1' - startZero + '0');
                startOne = (char)('1' - startOne + '0');
           }

           return Math.min(count1, count2);
    }
}