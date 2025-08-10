class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        while(start<end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) start++;
            if(!Character.isLetterOrDigit(s.charAt(end))) end--;
            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))) {
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) {
                    return false;
            }    
            start++;
            end--;
            }
        }
        return true;
    }
}