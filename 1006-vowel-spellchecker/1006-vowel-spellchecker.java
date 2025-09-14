class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactSet = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));

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
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (vowelSet.contains(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
