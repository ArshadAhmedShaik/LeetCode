class Solution {
    public int longestPalindrome(String s) {
       int[] count = new int[128];
       int res = 0;
       for(int i = 0;i < s.length();i++) {
            count[s.charAt(i)]++;
            if(count[s.charAt(i)]%2==0) {
                res += 2;
            }
       }

       for(int i = 0;i < count.length;i++) {
            if(count[i]%2!=0) {
                res += 1;
                break;
            }
       }

         return res;
      
       
    }
}