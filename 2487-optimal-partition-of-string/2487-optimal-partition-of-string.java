class Solution {
    public int partitionString(String s) {
        int count = 1;
        int mask = 0;
        char[] arr = s.toCharArray();

        for (char ch : arr) {
            int k = 1 << (ch - 'a');
            if ((mask & k) == 0) {
                mask |= k;
            } else {
                count++;
                mask = k;
            }
        }

        return count;
    }
}
