class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactSet = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));

// we care only abt first occurence: 

        for (String word : wordlist) {
            exactSet.add(word);
            String lower = word.toLowerCase();
            lowerMap.putIfAbsent(lower, word);
            String vowelKey = devowel(lower, vowelSet);
            vowelMap.putIfAbsent(vowelKey, word);
        }

        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactSet.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (lowerMap.containsKey(lower)) {
                    result[i] = lowerMap.get(lower);
                } else {
                    String vowelKey = devowel(lower, vowelSet);
                    if (vowelMap.containsKey(vowelKey)) {
                        result[i] = vowelMap.get(vowelKey);
                    } else {
                        result[i] = "";
                    }
                }
            }
        }
        return result;
    }

    private String devowel(String word, Set<Character> vowelSet) {
        char[] sb = new char[word.length()];
        int index = 0;
        for (char c : word.toCharArray()) {
            if (vowelSet.contains(c)) {
                sb[index++] = '*';
            } else {
                sb[index++] = c;
            }
        }
        return new String(sb);
    }
}
