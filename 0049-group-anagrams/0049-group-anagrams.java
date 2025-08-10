class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            char[] keyArr = new char[26 * 2];
            for (int i = 0; i < 26; i++) {
                keyArr[2 * i] = '#';
                keyArr[2 * i + 1] = (char) ('0' + count[i]);
            }
            String key = new String(keyArr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
