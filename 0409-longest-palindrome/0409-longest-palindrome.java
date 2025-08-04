class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        int evenCount = 0;
        while (it.hasNext()) {
            Map.Entry<Character, Integer> x = it.next();
            char ch = x.getKey();
            int freq = x.getValue();
            if (freq % 2 == 0) {
                evenCount += freq;
            } else {
                evenCount += freq - 1;
            }
        }
        if (evenCount < s.length())
            return evenCount + 1;
        return evenCount;
    }
}