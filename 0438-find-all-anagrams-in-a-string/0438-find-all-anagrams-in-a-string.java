public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        if (m > n) return new ArrayList<>();

        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int[][] prefix = new int[n + 1][26];
        for (int i = 1; i <= n; i++) {
            System.arraycopy(prefix[i - 1], 0, prefix[i], 0, 26);
            prefix[i][s.charAt(i - 1) - 'a']++;
        }

        List<Integer> res = new ArrayList<>();
        int i = 0, j = m - 1;
        while (j < n) {
            boolean isValid = true;
            for (int c = 0; c < 26; c++) {
                if (prefix[j + 1][c] - prefix[i][c] != pCount[c]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) res.add(i);
            i++;
            j++;
        }

        return res;
    }
}