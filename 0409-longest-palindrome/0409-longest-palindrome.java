class Solution {
    public int longestPalindrome(String s) {
         int[] count = new int[128];
         int res = 0;
         for(var x: s.toCharArray()) {
                count[x]++;
                if(count[x]%2==0) {
                    res += 2;
                }
         }
         if(res<s.length()) {
            res++;
         }
         return res;
    }
}