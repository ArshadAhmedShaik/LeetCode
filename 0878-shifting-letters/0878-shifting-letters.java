class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        long shift = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            sb.append((char)('a' + (s.charAt(i) - 'a' + (int)shift) % 26));
        }
        return sb.reverse().toString();
    }
}
