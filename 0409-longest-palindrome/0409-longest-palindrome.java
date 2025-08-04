class Solution {
    public int longestPalindrome(String s) {
       int[] count = new int[128];
       for(int i = 0;i < s.length();i++) {
            count[s.charAt(i)]++;
       }
       int evenCount = 0;
       for(int i = 0;i < count.length;i++) {
            if(count[i]!=0) {
                evenCount += (count[i]/2)*2;
            }
       }
       return (evenCount<s.length()) ? evenCount + 1 : evenCount;
    }
}