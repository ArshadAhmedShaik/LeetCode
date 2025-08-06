class Solution {
    public List<String> commonChars(String[] words) {
        if(words.length == 1) {
           List<String> res = new ArrayList<>();
           for(int i = 0;i < words[0].length();i++) {
                    res.add(String.valueOf(words[0].charAt(i)));
           }
           return res;
        }
        Map<Character, Integer> map = new HashMap<>();
        String first = words[0];
        for (int i = 0; i < first.length(); i++) {
            map.put(first.charAt(i), map.getOrDefault(first.charAt(i), 0) + 1);
        }
        List<String> res = new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            List<String> list = new ArrayList<>();

            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (map.containsKey(ch)) {
                    if (map.get(ch) != 0) {
                        map.put(ch, map.get(ch) - 1);
                        list.add(String.valueOf(ch));
                    }
                }
            }
            map.clear();
            for (var x : list) {
                map.put(x.charAt(0), map.getOrDefault(x.charAt(0), 0) + 1);
            }
            res = list;
        }
        return res;
    }
}