class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        char[] merged = new char[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            merged[k++] = word1.charAt(i++);
            merged[k++] = word2.charAt(j++);
        }
        while (i < n1) {
            merged[k++] = word1.charAt(i++);
        }
        while (j < n2) {
            merged[k++] = word2.charAt(j++);
        }
        return new String(merged);
    }
}
