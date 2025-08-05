class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsFreq = new int[26];
        for (char ch : chars.toCharArray()) {
            charsFreq[ch - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] wordFreq = new int[26];
            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }

            boolean isGood = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] > charsFreq[i]) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) sum += word.length();
        }

        return sum;
    }
}
