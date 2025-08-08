class Solution {
    public int minOperations(String s) {
           int count = 0;
           char cmp = '0';
           for(char ch : s.toCharArray()) {
                if(ch!=cmp) count++;
                cmp = (char)('1' - cmp + '0');
           }
           return Math.min(count, s.length()-count);
    }
}