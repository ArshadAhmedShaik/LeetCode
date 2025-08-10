class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
                int[] count = new int[26];
                char[] arr = new char[str.length()];
                for(int i = 0;i < str.length();i++) {
                        count[str.charAt(i)-'a']++;
                }
                int index = 0;
                for(int i = 0;i < count.length;i++) {
                        while(count[i]!=0) {
                                arr[index++] = (char)(i + 'a');
                                count[i]--;
                        }
                }
                String key = new String(arr);
                map.computeIfAbsent(key, t -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}