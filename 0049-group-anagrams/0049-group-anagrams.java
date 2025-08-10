public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String, List<String>> map = new HashMap<>();
           for(var s: strs) {
                 char[] ch = s.toCharArray();
                 Arrays.sort(ch);
                 String key = new String(ch);
                 map.putIfAbsent(key, new ArrayList<>());   
                 map.get(key).add(s);
           }

          return  new ArrayList<>(map.values());
     
    }
}