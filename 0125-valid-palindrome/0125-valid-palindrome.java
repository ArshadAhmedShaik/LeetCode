class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char ch1 = str[start];
            char ch2 = str[end];
            if (!Character.isLetterOrDigit(ch1)) {
                start++;
            } else if (!Character.isLetterOrDigit(ch2)) {
                end--;
            } else {
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                    return false;
                }
                end--;
                start++;
            }
        }
        return true;
    }
}