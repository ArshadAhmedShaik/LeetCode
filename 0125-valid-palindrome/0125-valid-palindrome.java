class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(str[start])) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str[end])) {
                end--;
            }

            if (Character.toLowerCase(str[start]) != Character.toLowerCase(str[end])) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
