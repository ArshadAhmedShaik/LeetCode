class Solution {
    public String customSortString(String order, String s) {
        int[] countS = new int[26];
        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (countS[c - 'a']-- > 0) {
                sb.append(c);
                
            }
        }

        for (int i = 0; i < 26; i++) {
            while (countS[i]-- > 0) {
                sb.append((char) ('a' + i));
            }
        }
        
        return sb.toString();
    }
}