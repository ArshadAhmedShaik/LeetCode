class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        long totalShift = 0;

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int val = (s.charAt(i) - 'a' + (int) totalShift) % 26;
            sb.append((char) ('a' + val));
        }

        return sb.reverse().toString();
    }
}
