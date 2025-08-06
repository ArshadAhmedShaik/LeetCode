class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        String first = words[0];

        if(words.length == 1) {
            List<String> list = new ArrayList<>();
            for(int i = 0;i < first.length();i++) {
                    list.add(String.valueOf(first.charAt(i)));
            }
            return list;
        } 

        for (int i = 0; i < first.length(); i++) {
            map.put(first.charAt(i), map.getOrDefault(first.charAt(i), 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            list.clear();
            String cmp = words[i];
            for (int j = 0; j < cmp.length(); j++) {
                if (map.containsKey(cmp.charAt(j))) {
                    if (map.get(cmp.charAt(j)) != 0) {
                        map.put(cmp.charAt(j), map.get(cmp.charAt(j)) - 1);
                        list.add(String.valueOf(cmp.charAt(j)));
                    }
                }
            }

            map.clear();

            for (var x : list) {
                map.put(x.charAt(0), map.getOrDefault(x.charAt(0), 0) + 1);
            }

        }

        return list;

    }
}