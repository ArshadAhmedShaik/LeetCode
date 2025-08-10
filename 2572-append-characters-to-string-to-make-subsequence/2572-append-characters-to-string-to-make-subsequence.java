class Solution {
    public int appendCharacters(String s, String t) {
        int left = 0;   // t
        int right = 0;  // s
        int n1 = t.length();
        int n2 = s.length();
        int count = 0;
        while(left<n1 && right<n2) {
            if(s.charAt(right)==t.charAt(left)) {
                count++;
                right++;
                left++;
            } else {
                right++;
            }
        }
        return n1 - count;
    }
}