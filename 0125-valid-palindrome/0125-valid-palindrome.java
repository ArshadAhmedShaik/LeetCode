class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int start = 0;
        int end = n - 1;
        while(start<end) {
               char ch1 = str[start];
               char ch2 = str[end];
               if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)) {
                    if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)) {
                            return false;
                    }
                    start++;
                    end--;
               } else {
                    if(!Character.isLetterOrDigit(ch1)) {
                        start++;
                    } 
                    else {
                        end--;
                    }
               }
        }
        return true;
    }
}