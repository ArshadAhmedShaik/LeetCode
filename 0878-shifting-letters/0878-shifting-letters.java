class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        int shift = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            int val = (s.charAt(i) - 'a' + shift) % 26;
            sb.append((char) ('a' + val));
        }
        return sb.reverse().toString();
    }
}
