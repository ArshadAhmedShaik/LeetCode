class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int n = words.length;
        int[] prefixCount = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixCount[i + 1] = prefixCount[i] + (isVowel(words[i]) ? 1 : 0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefixCount[end + 1] - prefixCount[start];
        }

        return ans;
    }

    private boolean isVowel(String word) {
        return isVowelChar(word.charAt(0)) && isVowelChar(word.charAt(word.length() - 1));
    }

    private boolean isVowelChar(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
