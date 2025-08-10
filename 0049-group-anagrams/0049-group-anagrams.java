class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
                char[] arr = str.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);
                map.computeIfAbsent(key, t -> new ArrayList<>()).add(str);
        }
        List<List<String>> res = new ArrayList<>();
        for(var x: map.entrySet()) {
              res.add(x.getValue());
        }
        return res;
    }
}