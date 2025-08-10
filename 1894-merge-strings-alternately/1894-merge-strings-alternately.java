class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder res = new StringBuilder(n1 + n2); // pre-allocate

        int left = 0, right = 0;
        while (left < n1 && right < n2) {
            res.append(word1.charAt(left++));
            res.append(word2.charAt(right++));
        }
        while (left < n1) {
            res.append(word1.charAt(left++));
        }
        while (right < n2) {
            res.append(word2.charAt(right++));
        }
        return res.toString();
    }
}
