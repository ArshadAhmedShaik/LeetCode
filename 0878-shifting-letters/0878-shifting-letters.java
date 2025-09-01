class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        long[] suffix = new long[n];

        suffix[n-1] = shifts[n-1];

        for(int i = n - 2;i >= 0;i--) {
                suffix[i] = suffix[i+1] + shifts[i];
        }

        for (int i = 0; i < n; i++) {
            long shift = suffix[i];
            long val = (s.charAt(i) - 'a' + shift) % 26;
            sb.append((char)('a' + val));
        }

        return sb.toString();
    }
}
