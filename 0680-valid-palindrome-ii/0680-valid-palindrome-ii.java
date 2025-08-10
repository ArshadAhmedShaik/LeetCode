class Solution {
    private boolean palindrome(String s,int start, int end) {
            while(start<end) {
                    if(s.charAt(start)!=s.charAt(end)) return false;
                    start++;
                    end--;
            }
            return true;
    }
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start<end) {
                if(s.charAt(start)==s.charAt(end)) {
                        start++;
                        end--;
                } else {
                   return palindrome(s, start, end - 1) || palindrome(s, start + 1, end);
                }
        }
        return true;
    }
}