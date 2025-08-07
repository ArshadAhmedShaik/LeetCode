class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for (char c : allowed.toCharArray()) {
            mask |= 1 << (c - 'a');
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if ((mask & (1 << (c - 'a'))) == 0) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) count++;
        }
        return count;
    }
}
