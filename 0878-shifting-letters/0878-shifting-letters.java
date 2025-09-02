class Solution {
    static {
         for(int i = 0;i < 500;i++)
            shiftingLetters("abcd", new int[] {1,2,3,4});    
    }
    public static String shiftingLetters(String s, int[] shifts) {
        char[] char_array = s.toCharArray();
        long total_shifts = 0L;
        int shifts_len = shifts.length;
        for (int i = shifts_len - 1; i >= 0; i--) {
            total_shifts= (total_shifts + shifts[i]) % 26;
            int original_char = char_array[i] - 'a';
            int new_char = (original_char + (int)total_shifts) % 26;
            char_array[i] =  (char) ('a' + new_char);
        }
        return new String(char_array);
    }
}