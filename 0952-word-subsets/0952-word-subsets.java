class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] freq = new int[26];
            for (char ch : b.toCharArray()) {
                freq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String a : words1) {
            int[] freq = new int[26];
            for (char ch : a.toCharArray()) {
                freq[ch - 'a']++;
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans.add(a);
        }
        return ans;
    }
}
