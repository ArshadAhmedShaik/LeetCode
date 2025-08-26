class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        if (n < k) return false;

        int total = 1 << k;
        boolean[] seen = new boolean[total];
        int allOnes = total - 1;
        int hash = 0, count = 0;

        for (int i = 0; i < n; i++) {
            hash = ((hash << 1) & allOnes) | (s.charAt(i) - '0');
            if (i >= k - 1 && !seen[hash]) {
                seen[hash] = true;
                count++;
                if (count == total) return true;
            }
        }
        return false;
    }
}
